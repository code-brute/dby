package com.dby.shop.utils.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import static org.joda.time.DateTime.now;

/**
 * @Description:
 * @Author: mitnick
 * @Date: 2017-09-15 上午11:53
 */
public class DateUtil {

    /**
     * 获取当前系统时间
     */
    public static Date dateNow() {
        return now().toDate();
    }

    /**
     * 现有的时间增加一天 并转换成 date
     */
    public static Date plusDays(int days) {
        LocalDateTime time = LocalDateTime.now();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime newTime = time.plusDays(days);
        Instant instant = newTime.atZone(zone).toInstant();
        return Date.from(instant);
    }

    /**
     * 传入的时间增加 天数
     */
    public static Date plusDays(Date date, int days) {
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = dateCovertLocalDateTime(date);

        LocalDateTime newTime = localDateTime.plusDays(days);
        return Date.from(newTime.atZone(zone).toInstant());
    }

    /**
     * 现有的时间增加一一小时 并转换成 date
     */
    public static Date plusHours(int hours) {
        LocalDateTime time = LocalDateTime.now();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime newTime = time.plusHours(hours);
        Instant instant = newTime.atZone(zone).toInstant();
        return Date.from(instant);
    }

    /**
     * 传入的时间增加 小时数
     */
    public static Date plusHours(Date date, int hours) {
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = dateCovertLocalDateTime(date);
        LocalDateTime newTime = localDateTime.plusHours(hours);
        return Date.from(newTime.atZone(zone).toInstant());
    }

    /**
     * 现有的时间增加一一一分钟 并转换成 date
     */
    public static Date plusMinutes(int minutes) {
        LocalDateTime time = LocalDateTime.now();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime newTime = time.plusMinutes(minutes);
        Instant instant = newTime.atZone(zone).toInstant();
        return Date.from(instant);
    }

    /**
     * 获取第二天0点
     */
    public static Date getTimeOf12() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    /**
     * string 转换 date  yyyy-MM-dd HH:mm:ss
     */
    public static String getFormatDate(Long time, String dateFormat) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        String date = simpleDateFormat.format(time);
        return date;
    }

    public static Date getParseDate(String  time, String dateFormat) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        Date date = simpleDateFormat.parse(time);
        return date;
    }

    public static Date calculateDatePercent(float percent, Date date) {
        LocalDateTime localDateTime = dateCovertLocalDateTime(date);
        Float dateMinus = ChronoUnit.MINUTES.between(LocalDateTime.now(), localDateTime) * (percent / 10);
        return localDateTimeCovertDate(LocalDateTime.now().plusMinutes(dateMinus.intValue()));
    }

    public static Date calculateDatePercent(float percent,Date startDate, Date endDate) {
        if (Objects.isNull(startDate)) {
            startDate = dateNow();
        }
        if (Objects.isNull(endDate)) {
            endDate = plusDays(startDate, 1);
        }
        LocalDateTime localStartDateTime = dateCovertLocalDateTime(startDate);
        LocalDateTime localEndDateTime = dateCovertLocalDateTime(endDate);
        Float dateMinus = ChronoUnit.MINUTES.between(localStartDateTime, localEndDateTime) * (percent / 10);

        return localDateTimeCovertDate(LocalDateTime.now().plusMinutes(dateMinus.intValue()));
    }

    public static LocalDateTime dateCovertLocalDateTime(Date date) {
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

    public static Date localDateTimeCovertDate(LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }
}
