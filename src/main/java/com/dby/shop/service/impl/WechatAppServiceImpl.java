package com.dby.shop.service.impl;

import com.dby.shop.config.base.BaseService;
import com.dby.shop.domain.IWechatAppDOM;
import com.dby.shop.entity.Address;
import com.dby.shop.entity.DeviceHardware;
import com.dby.shop.entity.SysIndustry;
import com.dby.shop.entity.SysUser;
import com.dby.shop.service.IWechatAppService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午2:35
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class WechatAppServiceImpl extends BaseService implements IWechatAppService {

    private static Logger logger = LoggerFactory.getLogger(WechatAppServiceImpl.class);

    @Autowired
    IWechatAppDOM wechatAppLoginDOM;


    @Override
    public String login(String code,String nickName) {
        return wechatAppLoginDOM.login(code,nickName);
    }

    @Override
    public List<SysIndustry> getIndustryInfo() {
        return wechatAppLoginDOM.getIndustryInfo();
    }

    @Override
    public void register(SysUser sysUser,String sessionKey) {
         wechatAppLoginDOM.register(sysUser,sessionKey);
    }

    @Override
    public void uploadFile(String id, String imageType, MultipartFile photoFile,String sessionKey) {
        wechatAppLoginDOM.uploadFile(id,imageType,photoFile,sessionKey);
    }

    @Override
    public SysUser getSysUserInfo(String sessionKey) {
        return wechatAppLoginDOM.getSysUserInfo(sessionKey);
    }

    @Override
    public Address getAddressInfo(String sessionKey,Integer id) {
        return wechatAppLoginDOM.getAddressInfo(sessionKey,id);
    }

    @Override
    public Address insertAddressInfo(String sessionKey, Address address) {
        return wechatAppLoginDOM.insertAddressInfo(sessionKey,address);
    }

    @Override
    public List<Address> getAddressList(String sessionKey) {
        return wechatAppLoginDOM.getAddressList(sessionKey);
    }

    @Override
    public void deleteAddressInfo(String sessionKey, Integer id) {
        wechatAppLoginDOM.deleteAddressInfo(sessionKey,id);
    }

    @Override
    public Address activeAddressInfo(String sessionKey, Integer id, String isDefault) {
        return  wechatAppLoginDOM.activeAddressInfo(sessionKey,id,isDefault);
    }

    @Override
    public List<DeviceHardware> getMapDeviceHardwareInfo(String sessionKey) {
        return wechatAppLoginDOM.getMapDeviceHardwareInfo(sessionKey);
    }
}
