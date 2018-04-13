package com.dby.shop.service.impl;

import com.dby.shop.config.base.BaseService;
import com.dby.shop.domain.IWechatAppDOM;
import com.dby.shop.service.IWechatAppService;

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
public class WechatAppServiceImpl extends BaseService implements IWechatAppService {

    private static Logger logger = LoggerFactory.getLogger(WechatAppServiceImpl.class);

    @Autowired
    IWechatAppDOM wechatAppLoginDOM;


    @Override
    public String login(String code,String nickName) {
        return wechatAppLoginDOM.login(code,nickName);
    }
}
