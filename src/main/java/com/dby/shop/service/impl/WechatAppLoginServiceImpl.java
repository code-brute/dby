package com.dby.shop.service.impl;

import com.dby.shop.config.base.BaseService;
import com.dby.shop.domain.IWechatAppLoginDOM;
import com.dby.shop.service.IWechatAppLoginService;
import com.dby.shop.web.WechatAppLoginResource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午2:35
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class WechatAppLoginServiceImpl extends BaseService implements IWechatAppLoginService{

    private static Logger logger = LoggerFactory.getLogger(WechatAppLoginServiceImpl.class);

    @Autowired
    IWechatAppLoginDOM wechatAppLoginDOM;


    @Override
    public void login() {
        wechatAppLoginDOM.login();
    }
}
