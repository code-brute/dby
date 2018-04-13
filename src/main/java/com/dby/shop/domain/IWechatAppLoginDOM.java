package com.dby.shop.domain;

import com.dby.shop.config.base.IDomain;

/**
 * @Description:
 * @author: mitnick
 * @date: 2018-04-12 下午2:36
 */
public interface IWechatAppLoginDOM extends IDomain{

    String login(String code,String nickName);

}
