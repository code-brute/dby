package com.dby.shop.web;

import com.dby.shop.config.base.BaseResource;
import com.dby.shop.config.base.ResultBean;
import com.dby.shop.service.IWechatAppLoginService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午2:25
 */
@RestController
@RequestMapping("/api/app")
public class WechatAppLoginResource extends BaseResource{

    private static Logger logger = LoggerFactory.getLogger(WechatAppLoginResource.class);

    @Autowired
    IWechatAppLoginService wechatAppLoginService;

    @RequestMapping(value = "/wechat/login",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultBean> onLogin(){
        ResultBean resultBean = new ResultBean();
        ResponseEntity<ResultBean> responseEntity = new ResponseEntity<ResultBean>(HttpStatus.OK);


        return responseEntity;
    }
}
