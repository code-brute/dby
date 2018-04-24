package com.dby.shop.domain.impl;

import com.alibaba.fastjson.JSONObject;
import com.dby.shop.config.Constants;
import com.dby.shop.config.base.BaseDomain;
import com.dby.shop.config.cache.CacheConstants;
import com.dby.shop.dao.IAddressSDAO;
import com.dby.shop.dao.IAppConfigSDAO;
import com.dby.shop.dao.IDeviceHardwareSDAO;
import com.dby.shop.dao.ISysConfigSDAO;
import com.dby.shop.dao.ISysIndustrySDAO;
import com.dby.shop.dao.ISysUserSDAO;
import com.dby.shop.domain.IWechatAppDOM;
import com.dby.shop.entity.Address;
import com.dby.shop.entity.AddressExample;
import com.dby.shop.entity.AppConfig;
import com.dby.shop.entity.AppConfigExample;
import com.dby.shop.entity.DeviceHardware;
import com.dby.shop.entity.DeviceHardwareExample;
import com.dby.shop.entity.SysConfig;
import com.dby.shop.entity.SysConfigExample;
import com.dby.shop.entity.SysIndustry;
import com.dby.shop.entity.SysIndustryExample;
import com.dby.shop.entity.SysUser;
import com.dby.shop.entity.SysUserDTO;
import com.dby.shop.entity.SysUserExample;
import com.dby.shop.utils.cache.DBYCacheManager;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.cache.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.List;
import java.util.Objects;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static com.dby.shop.utils.common.DateUtil.dateNow;
import static com.dby.shop.utils.common.DateUtil.getFormatDate;
import static com.dby.shop.utils.common.Encrypt.encrypt;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午2:36
 */
@Component
public class WechatAppDOMImpl extends BaseDomain implements IWechatAppDOM {


    private static Logger logger = LoggerFactory.getLogger(WechatAppDOMImpl.class);

    @Autowired
    private IAppConfigSDAO appConfigSDAO;

    @Autowired
    private ISysConfigSDAO sysConfigSDAO;

    @Autowired
    private ISysIndustrySDAO sysIndustrySDAO;

    @Autowired
    private ISysUserSDAO sysUserSDAO;

    @Autowired
    private IAddressSDAO addressSDAO;

    @Autowired
    private IDeviceHardwareSDAO deviceHardwareSDAO;

    @Autowired
    Environment environment;

    @Override
    public String login(String code, String nickName) {
        //创建OkHttpClient对象
        SysConfigExample sysConfigExample = new SysConfigExample();
        SysConfigExample.Criteria criteria = sysConfigExample.createCriteria()
                .andPrptyEqualTo("appid").andStatusEqualTo(Constants.AVAILABLE_DATA);

        SysConfigExample.Criteria criteria1 = sysConfigExample.createCriteria()
                .andPrptyEqualTo("secret").andStatusEqualTo(Constants.AVAILABLE_DATA);

        sysConfigExample.or(criteria1);
        String appid = "";
        String secret = "";
        List<SysConfig> sysConfigs = sysConfigSDAO.selectByExample(sysConfigExample);
        logger.debug("{}", sysConfigs);
        if (Objects.nonNull(sysConfigs) && !sysConfigs.isEmpty()) {
            for (SysConfig sysConfig : sysConfigs) {
                if ("appid".equals(sysConfig.getPrpty())) {
                    appid = sysConfig.getPrptyValue();
                } else if ("secret".equals(sysConfig.getPrpty())) {
                    secret = sysConfig.getPrptyValue();
                }
            }
        }

        StringBuilder url = new StringBuilder("https://api.weixin.qq.com/sns/jscode2session")
                .append("?appid=").append(appid)
                .append("&secret=").append(secret).append("&js_code=")
                .append(code).append("&grant_type=authorization_code");

        logger.debug("小程序登录验证url: {}", url);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                //请求接口。如果需要传参拼接到接口后面。
                .url(url.toString())
                //创建Request 对象
                .build();
        Response response;
        String appSession = null;
        try {
            //得到Response 对象
            response = client.newCall(request).execute();

            if (response.isSuccessful()) {
                JSONObject jsonObject = JSONObject.parseObject(response.body().string());
                logger.debug("小程序登录验证返回结果为：{}", jsonObject);
                String sessionKey = jsonObject.getString("session_key");
                String openId = jsonObject.getString("openid");
                appSession = encrypt(sessionKey, openId);
                // 将 openID sessionKey 记录进 表中
                AppConfig appConfig = insertAppconfig(code, nickName, sessionKey, openId, appSession);

                Cache cache = DBYCacheManager.getInstance().getCache(CacheConstants.SESSION_KEY);
                cache.put(appSession, appConfig);
            }

        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return appSession;
    }

    @Override
    public List<SysIndustry> getIndustryInfo() {
        SysIndustryExample sysIndustryExample = new SysIndustryExample();
        sysIndustryExample.createCriteria().andStatusEqualTo(Constants.AVAILABLE_DATA);
        sysIndustryExample.setOrderByClause("ID desc");
        List<SysIndustry> sysIndustries = sysIndustrySDAO.selectByExample(sysIndustryExample);
        return sysIndustries;
    }

    @Override
    public void register(SysUser sysUser, String sessionKey) {
        AppConfig appConfig = getAppConfigByCache(sessionKey);
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andStatusEqualTo(Constants.AVAILABLE_DATA)
                .andLoginNameEqualTo(sysUser.getLoginName()).andOpenIdEqualTo(appConfig.getOpenId());
        List<SysUser> sysUserList = sysUserSDAO.selectByExample(sysUserExample);
        SysUser user = null;
        if (Objects.nonNull(sysUserList) && !sysUserList.isEmpty()) {
            user = sysUserList.get(0);
            user.setStatus(Constants.INVALID);
            sysUserSDAO.updateByExample(user, sysUserExample);
        }
        sysUser.setOpenId(appConfig.getOpenId());
        sysUser.setStatus(Constants.AVAILABLE_DATA);
        sysUser.setCreateBy(sysUser.getLoginName());
        sysUser.setCreateDate(dateNow());
        sysUser.setLastModifyBy(sysUser.getLoginName());
        sysUser.setLastModifyDate(dateNow());
        sysUserSDAO.insert(sysUser);
    }

    @Override
    public void uploadFile(String id, String imageType, MultipartFile photoFile, String sessionKey) {
        try {
            if (Objects.nonNull(photoFile)) {
                String name = photoFile.getOriginalFilename();
                String fileName = dateNow().getTime() + imageType + id + name.substring(name.lastIndexOf("."));
                String filePath = environment.getProperty("system.upload");
                String file = "api" + File.separator + "app" + File.separator + "personInfo" + File.separator + fileName;
                File dest = new File(filePath + File.separator + file);
                if (!dest.getParentFile().exists()) {
                    dest.getParentFile().mkdirs();
                }
                transferTo(photoFile, dest);

                //图片上传完成需要记录路径
                updateSysUserPhoto(imageType, sessionKey, file);
            }
        } catch (Exception e) {
            logger.error("上传图片出错 {} ", e.getMessage(), e);
        }
    }

    @Override
    public SysUser getSysUserInfo(String sessionKey) {
        SysUser sysUser = null;
        SysUserDTO sysUserDTO = new SysUserDTO();
        try {
            AppConfig appConfig = getAppConfigByCache(sessionKey);
            SysUserExample sysUserExample = new SysUserExample();
            sysUserExample.createCriteria().andStatusEqualTo(Constants.AVAILABLE_DATA).andOpenIdEqualTo(appConfig.getOpenId());
            List<SysUser> sysUsers = sysUserSDAO.selectByExample(sysUserExample);
            sysUser = null;
            if (Objects.nonNull(sysUsers) && !sysUsers.isEmpty()) {
                sysUser = sysUsers.get(0);

                SysIndustry sysIndustry = sysIndustrySDAO.selectByPrimaryKey(sysUser.getIndustry());
                PropertyUtils.copyProperties(sysUserDTO, sysUser);
                if (Objects.nonNull(sysIndustry)) {
                    sysUserDTO.setIndustryDesc(sysIndustry.getName());
                }

            }
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return sysUserDTO;
    }


    @Override
    public Address getAddressInfo(String sessionKey, Integer id) {

        return addressSDAO.selectByPrimaryKey(id);
    }

    @Override
    public Address insertAddressInfo(String sessionKey, Address address) {
        AppConfig appConfig = getAppConfigByCache(sessionKey);
        setAddressUnActivite(appConfig);


        address.setOpenId(appConfig.getOpenId());
        address.setCreateBy(appConfig.getLastModifyBy());
        address.setCreateDate(dateNow());
        address.setStatus(Constants.AVAILABLE_DATA);
        address.setLastModifyBy(appConfig.getLastModifyBy());
        address.setLastModifyDate(dateNow());
        if (Objects.nonNull(address.getId()) && address.getId() != 0) {
            addressSDAO.updateByPrimaryKey(address);
        } else {
            addressSDAO.insert(address);
        }


        return address;
    }

    private void setAddressUnActivite(AppConfig appConfig) {
        // 更新 所有的 isdeafult 为false
        AddressExample addressExample = new AddressExample();
        addressExample.createCriteria().andOpenIdEqualTo(appConfig.getOpenId())
                .andStatusEqualTo(Constants.AVAILABLE_DATA);
        List<Address> addressList = addressSDAO.selectByExample(addressExample);
        if (!addressList.isEmpty()) {
            for (Address a : addressList) {
                a.setIsDefault("false");
                addressSDAO.updateByPrimaryKey(a);
            }
        }
    }

    @Override
    public List<Address> getAddressList(String sessionKey) {
        AppConfig appConfig = getAppConfigByCache(sessionKey);
        AddressExample addressExample = new AddressExample();
        addressExample.createCriteria().andOpenIdEqualTo(appConfig.getOpenId()).andStatusEqualTo(Constants.AVAILABLE_DATA);
        return addressSDAO.selectByExample(addressExample);
    }

    @Override
    public void deleteAddressInfo(String sessionKey, Integer id) {
        AppConfig appConfig = getAppConfigByCache(sessionKey);
        Address address = addressSDAO.selectByPrimaryKey(id);
        address.setStatus(Constants.INVALID);
        addressSDAO.updateByPrimaryKey(address);
    }

    @Override
    public Address activeAddressInfo(String sessionKey, Integer id, String isDefault) {
        AppConfig appConfig = getAppConfigByCache(sessionKey);
        setAddressUnActivite(appConfig);
        Address address  = addressSDAO.selectByPrimaryKey(id);
        address.setIsDefault(isDefault);
        address.setLastModifyDate(dateNow());
        addressSDAO.updateByPrimaryKey(address);
        return address;
    }

    @Override
    public List<DeviceHardware> getMapDeviceHardwareInfo(String sessionKey) {
        DeviceHardwareExample deviceHardwareExample = new DeviceHardwareExample();
        deviceHardwareExample.createCriteria()
                .andStatusEqualTo(Constants.AVAILABLE_DATA);
        return deviceHardwareSDAO.selectByExample(deviceHardwareExample);
    }

    private AppConfig getAppConfigByCache(String sessionKey) {
        Cache cache = DBYCacheManager.getInstance().getCache(CacheConstants.SESSION_KEY);
        AppConfig appConfig = (AppConfig) cache.get(sessionKey);
        if (Objects.isNull(appConfig)) {
            AppConfigExample appConfigExample = new AppConfigExample();
            appConfigExample.createCriteria().andAppSessionEqualTo(sessionKey).andStatusEqualTo(Constants.AVAILABLE_DATA);
            List<AppConfig> appConfigs = appConfigSDAO.selectByExample(appConfigExample);
            if (!appConfigs.isEmpty()) {
                appConfig = appConfigs.get(0);
                cache.put(sessionKey, appConfig);
            }
        }
        return appConfig;
    }


    private synchronized void updateSysUserPhoto(String imageType, String sessionKey, String file) {
        AppConfig appConfig = getAppConfigByCache(sessionKey);
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andOpenIdEqualTo(appConfig.getOpenId()).andStatusEqualTo(Constants.AVAILABLE_DATA);
        List<SysUser> sysUsers = sysUserSDAO.selectByExample(sysUserExample);
        if (Objects.nonNull(sysUsers) && !sysUsers.isEmpty()) {
            SysUser sysUser = sysUsers.get(0);
            if ("storePhoto".equals(imageType)) {
                if (StringUtils.isNotBlank(sysUser.getStorePhoto())) {
                    file = file + "," + sysUser.getStorePhoto();
                }
                sysUser.setStorePhoto(file);
            } else if ("checkoutCounterPhoto".equals(imageType)) {
                if (StringUtils.isNotBlank(sysUser.getCheckoutCounterPhoto())) {
                    file = file + "," + sysUser.getCheckoutCounterPhoto();
                }
                sysUser.setCheckoutCounterPhoto(file);
            } else {
                if (StringUtils.isNotBlank(sysUser.getBusinessLicensePhoto())) {
                    file = file + "," + sysUser.getBusinessLicensePhoto();
                }
                sysUser.setBusinessLicensePhoto(file);
            }
            sysUserSDAO.updateByExample(sysUser, sysUserExample);
        }
    }

    @Async
    void transferTo(MultipartFile multipartFile, File dest) {
        try {
            multipartFile.transferTo(dest);
        } catch (IOException e) {
            logger.error("图片上传出现异常,{}", e);
        }
    }

    private AppConfig insertAppconfig(String code, String nickName, String sessionKey, String openId, String appSession) {

        // 需要先查询之前的数据，如果存在则删除
        deleteAppConfigByOpenId(nickName, openId);

        AppConfig appConfig = new AppConfig();
        appConfig.setOpenId(openId);
        appConfig.setSessionKey(sessionKey);
        appConfig.setAppSession(appSession);
        appConfig.setStatus(Constants.AVAILABLE_DATA);
        appConfig.setLastModifyBy(nickName);
        appConfig.setCreateBy(nickName);
        appConfig.setCreateDate(dateNow());
        appConfig.setLastModifyDate(dateNow());
        appConfig.setAppCode(code);
        appConfigSDAO.insert(appConfig);
        return appConfig;
    }


    private void deleteAppConfigByOpenId(String nickName, String openId) {
        AppConfigExample appConfigExample = new AppConfigExample();
        appConfigExample.createCriteria().andOpenIdEqualTo(openId).andLastModifyByEqualTo(nickName);
        appConfigSDAO.deleteByExample(appConfigExample);
    }

}
