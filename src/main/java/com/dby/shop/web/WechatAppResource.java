package com.dby.shop.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dby.shop.config.base.BaseResource;
import com.dby.shop.config.base.ResultBean;
import com.dby.shop.entity.Address;
import com.dby.shop.entity.DeviceHardware;
import com.dby.shop.entity.SysIndustry;
import com.dby.shop.entity.SysUser;
import com.dby.shop.service.IWechatAppService;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午2:25
 */
@RestController
@RequestMapping("/api/app")
public class WechatAppResource extends BaseResource {

    private static Logger logger = LoggerFactory.getLogger(WechatAppResource.class);

    @Autowired
    IWechatAppService wechatAppLoginService;

    @Autowired
    Environment environment;

    @RequestMapping(value = "/wechat/login",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultBean> onLogin(@RequestParam(name = "code") String code,
                                              @RequestParam(name = "nickName") String nickName) {
        ResultBean resultBean = new ResultBean();
        ResponseEntity<ResultBean> responseEntity = null;
        try {

            String sessionKey = wechatAppLoginService.login(code, nickName);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("sessionKey", sessionKey);
            resultBean.setData(jsonObject);
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
            logger.debug("小程序成功登录 {}", code);
        } catch (Exception e) {
            resultBean = new ResultBean();
            resultBean.setCode(HttpStatus.UNPROCESSABLE_ENTITY.value());
            resultBean.setMsg("小程序登录失败" + e.getMessage());
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.UNPROCESSABLE_ENTITY);
        }

        return responseEntity;
    }

    @RequestMapping(value = "/wechat/industry",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultBean> getIndustryInfo(@RequestHeader(value = "sessionKey") String sessionKey) {
        ResultBean resultBean = new ResultBean();
        ResponseEntity<ResultBean> responseEntity = null;
        try {
            logger.debug("开始获取行业信息");
            List<SysIndustry> sysIndustrys = wechatAppLoginService.getIndustryInfo();
            resultBean.setData(sysIndustrys);
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
            logger.debug("成功获取行业信息 {}", sysIndustrys);

        } catch (Exception e) {
            resultBean = new ResultBean();
            resultBean.setCode(HttpStatus.UNPROCESSABLE_ENTITY.value());
            resultBean.setMsg("获取行业信息失败" + e.getMessage());
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.UNPROCESSABLE_ENTITY);
        }
        return responseEntity;
    }

    @RequestMapping(value = "/wechat/upload",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultBean> uploadFile(HttpServletRequest request,
                                                 HttpServletResponse response,
                                                 @RequestParam(value = "id") String id,
                                                 @RequestParam(value = "imageType") String imageType,
                                                 @RequestHeader(value = "sessionKey") String sessionKey,
                                                 @RequestPart(value = "photoFile", required = false) MultipartFile photoFile) throws Exception {
        ResponseEntity<ResultBean> responseEntity = null;
        logger.debug("开始上传照片{}", imageType);
        try {
            wechatAppLoginService.uploadFile(id, imageType, photoFile, sessionKey);

        } catch (Exception e) {
            logger.error("上传照片出错 {} ", e.getMessage(), e);
            responseEntity = new ResponseEntity<ResultBean>(HttpStatus.UNPROCESSABLE_ENTITY);
        }
        return new ResponseEntity<ResultBean>(HttpStatus.OK);
    }

    @RequestMapping(value = "/wechat/register",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultBean> register(@RequestBody SysUser sysUser,
                                               @RequestHeader(value = "sessionKey") String sessionKey) {
        ResponseEntity<ResultBean> responseEntity = null;
        try {
            logger.debug("注册用户开始，用户信息为{}", sysUser.toString());
            ResultBean resultBean = new ResultBean();
            wechatAppLoginService.register(sysUser, sessionKey);
            resultBean.setData(sysUser.getId());
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("注册用户失败！{}", e.getMessage(), e);
            responseEntity = new ResponseEntity<ResultBean>(HttpStatus.UNPROCESSABLE_ENTITY);
        }
        return responseEntity;
    }

    @RequestMapping(value = "/wechat/sysUserInfo",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultBean> getSysUserInfo(@RequestHeader(value = "sessionKey") String sessionKey) {
        ResponseEntity<ResultBean> responseEntity = null;
        try {
            logger.debug("开始获取用户信息");
            ResultBean resultBean = new ResultBean();
            SysUser sysUser = wechatAppLoginService.getSysUserInfo(sessionKey);
            resultBean.setData(sysUser);
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("注册用户失败！{}", e.getMessage(), e);
            responseEntity = new ResponseEntity<ResultBean>(HttpStatus.UNPROCESSABLE_ENTITY);
        }
        return responseEntity;
    }

    @RequestMapping(value = "/wechat/address/list",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultBean> getAddressList(@RequestHeader(value = "sessionKey") String sessionKey) {
        ResponseEntity<ResultBean> responseEntity = null;
        try {
            ResultBean resultBean = new ResultBean();
            logger.debug("查询收货地址开始");
            List<Address> addressList = wechatAppLoginService.getAddressList(sessionKey);
            logger.debug("查询收货地址结束");
            resultBean.setData(addressList);
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("查询收货地址出错{}",e.getMessage(),e);
            ResultBean resultBean = new ResultBean();
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);

        }
        return responseEntity;
    }

    @RequestMapping(value = "/wechat/address",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultBean> getAddressInfo(@RequestHeader(value = "sessionKey") String sessionKey,
                                                     @RequestParam(value = "id") Integer id) {
        ResponseEntity<ResultBean> responseEntity = null;
        try {
            ResultBean resultBean = new ResultBean();
            logger.debug("查询收货地址开始");
            Address address = wechatAppLoginService.getAddressInfo(sessionKey,id);
            logger.debug("查询收货地址结束");
            resultBean.setData(address);
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("查询收货地址出错{}",e.getMessage(),e);
            ResultBean resultBean = new ResultBean();
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);

        }
        return responseEntity;
    }

    @RequestMapping(value = "/wechat/address",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultBean> insertAddressInfo(@RequestHeader(value = "sessionKey") String sessionKey,
                                                        @RequestBody Address address) {
        ResponseEntity<ResultBean> responseEntity = null;
        try {
            logger.debug("插入地址{}",address);
            ResultBean resultBean = new ResultBean();
            address = wechatAppLoginService.insertAddressInfo(sessionKey,address);
            logger.debug("插入地址结束");
            resultBean.setData(address.getId());
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("插入地址出错 {} ",e.getMessage(),e);
            ResultBean resultBean = new ResultBean();
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        }
        return responseEntity;
    }

    @RequestMapping(value = "/wechat/address",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultBean> deleteAddressInfo(@RequestHeader(value = "sessionKey") String sessionKey,
                                                        @RequestParam(value = "id") Integer id) {
        ResponseEntity<ResultBean> responseEntity = null;
        try {
            logger.debug("删除地址{}",id);
            ResultBean resultBean = new ResultBean();
             wechatAppLoginService.deleteAddressInfo(sessionKey,id);
            logger.debug("删除地址");
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("删除地址出错{} ",e.getMessage(),e);
            ResultBean resultBean = new ResultBean();
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        }
        return responseEntity;
    }

    @RequestMapping(value = "/wechat/address/active",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultBean> activeAddressInfo(@RequestHeader(value = "sessionKey") String sessionKey,
                                                        @RequestParam(value = "id") String id,
                                                        @RequestParam(value = "isDefault") String isDefault) {
        ResponseEntity<ResultBean> responseEntity = null;
        try {
            logger.debug("设置默认地址{}",id);
            ResultBean resultBean = new ResultBean();
            wechatAppLoginService.activeAddressInfo(sessionKey,Integer.parseInt(id),isDefault);
            logger.debug("设置默认地址");
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("设置默认地址出错{} ",e.getMessage(),e);
            ResultBean resultBean = new ResultBean();
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        }
        return responseEntity;
    }

    @RequestMapping(value = "/wechat/deviceHardware",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultBean> getMapDeviceHardwareInfo(@RequestHeader(value = "sessionKey") String sessionKey) {
        ResponseEntity<ResultBean> responseEntity = null;
        try {
            logger.debug("获取设备经纬度信息开始");
            ResultBean resultBean = new ResultBean();
            List<DeviceHardware> deviceHardwares = wechatAppLoginService.getMapDeviceHardwareInfo(sessionKey);
            logger.debug("成功获取设备经纬度信息");
            resultBean.setData(deviceHardwares);
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("获取设备经纬度信息出错{} ",e.getMessage(),e);
            ResultBean resultBean = new ResultBean();
            responseEntity = new ResponseEntity<ResultBean>(resultBean, HttpStatus.OK);
        }
        return responseEntity;
    }


}
