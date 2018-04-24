package com.dby.shop.dao;

import com.dby.shop.DbyApplicationTests;
import com.dby.shop.config.Constants;
import com.dby.shop.entity.DeviceHardware;
import com.dby.shop.entity.DeviceHardwareExample;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import static com.dby.shop.utils.common.DateUtil.dateNow;
import static org.junit.Assert.*;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-17 下午4:13
 */
public class IDeviceHardwareSDAOTest extends DbyApplicationTests{
    @Test
    public void updateByPrimaryKeySelective() throws Exception {
    }

    @Autowired
    private IDeviceHardwareSDAO iDeviceHardwareSDAO;
//    @Test
//    public void insert() throws Exception {
//
//        Class.forName("com.mysql.jdbc.Driver");//加载驱动
//
//        String jdbc="jdbc:mysql://127.0.0.1:3306/db?characterEncoding=GBK";
//        Connection conn= DriverManager.getConnection(jdbc, "root", "root");//链接到数据库
//
//        Statement state=conn.createStatement();   //容器
//        String sql="select * from device_hardware";   //SQL语句
//        ResultSet rs=state.executeQuery(sql);     //将sql语句传至数据库，返回的值为一个字符集用一个变量接收
//
//        while(rs.next()){    //next（）获取里面的内容
//            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//            //getString（n）获取第n列的内容
//            //数据库中的列数是从1开始的
////            CREATE TABLE `db`.`Untitled`  (
////  `id` int(11) NOT NULL AUTO_INCREMENT,
////  `deviceid` int(11) NULL DEFAULT NULL,
////  `screenwidth` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `screenheight` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `diskspace` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `softwareversion` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `screenrotate` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `devicecpu` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `usespace` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `latitude` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `longitude` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `addressheight` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `cityname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `mac` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `camera` int(11) NULL DEFAULT NULL COMMENT '0无摄像头 1有摄像头',
////  `deviceIp` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `contactName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `contactPhone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////  `operateTime` datetime(0) NULL DEFAULT NULL,
////  `firmName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
////            PRIMARY KEY (`id`) USING BTREE
////) ENGINE = InnoDB AUTO_INCREMENT = 4192 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
//            DeviceHardware deviceHardware = new DeviceHardware();
//            deviceHardware.setDeviceId(rs.getInt(2));
//            deviceHardware.setScreenWidth(rs.getString(3));
//            deviceHardware.setScreenHeight(rs.getString(4));
//            deviceHardware.setDiskspace(rs.getString(5));
//            deviceHardware.setSoftwareVersion(rs.getString(6));
//            deviceHardware.setScreenRotate(rs.getString(7));
//            deviceHardware.setDeviceCpu(rs.getString(8));
//            deviceHardware.setUseSpace(rs.getString(9));
//            deviceHardware.setLatitude(rs.getString(10));
//            deviceHardware.setLongitude(rs.getString(11));
//            deviceHardware.setAddress(rs.getString(12));
//            deviceHardware.setAddressHeight(rs.getString(13));
//            deviceHardware.setCityName(rs.getString(14));
//            deviceHardware.setMac(rs.getString(15));
//            deviceHardware.setCamera(rs.getInt(16));
//            deviceHardware.setDeviceIp(rs.getString(17));
//            deviceHardware.setContactName(rs.getString(18));
//            deviceHardware.setOperateTime(rs.getTime(19));
//            deviceHardware.setFirmName(rs.getString(20));
//            iDeviceHardwareSDAO.insert(deviceHardware);
//        }
//
//        conn.close();//关闭通道
//    }

    @Test
    public void update(){

        DeviceHardwareExample deviceHardwareExample = new DeviceHardwareExample();

        List<DeviceHardware> list = iDeviceHardwareSDAO.selectByExample(deviceHardwareExample);
        if(!list.isEmpty()){
            for (DeviceHardware deviceHardware : list) {
                deviceHardware.setStatus(Constants.AVAILABLE_DATA);
                deviceHardware.setCreateBy("jackson");
                deviceHardware.setCreateDate(dateNow());
                deviceHardware.setLastModifyBy("jackson");
                deviceHardware.setLastModifyDate(dateNow());
                iDeviceHardwareSDAO.updateByPrimaryKeySelective(deviceHardware);
            }
        }
    }
}