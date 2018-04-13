package com.dby.shop.service;

import com.dby.shop.config.base.BaseService;
import com.dby.shop.config.base.IService;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午2:34
 */
public interface IWechatAppLoginService extends IService {

    String login(String code,String nickName);
}
