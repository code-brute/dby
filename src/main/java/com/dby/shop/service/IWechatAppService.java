package com.dby.shop.service;

import com.dby.shop.config.base.BaseService;
import com.dby.shop.config.base.IService;
import com.dby.shop.entity.Address;
import com.dby.shop.entity.DeviceHardware;
import com.dby.shop.entity.SysIndustry;
import com.dby.shop.entity.SysUser;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午2:34
 */
public interface IWechatAppService extends IService {

    String login(String code,String nickName);

    List<SysIndustry> getIndustryInfo();

    void register(SysUser sysUser,String sessionKey);

    void uploadFile(String id, String imageType,MultipartFile photoFile,String sessionKey);

    SysUser getSysUserInfo(String sessionKey);

    Address getAddressInfo(String sessionKey,Integer id);

    Address insertAddressInfo(String sessionKey, Address address);

    List<Address> getAddressList(String sessionKey);

    void deleteAddressInfo(String sessionKey, Integer id);

    Address activeAddressInfo(String sessionKey, Integer id, String isDefault);

    List<DeviceHardware> getMapDeviceHardwareInfo(String sessionKey);
}
