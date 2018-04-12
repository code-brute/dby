package com.dby.shop.utils.security.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @Description:账号不存在异常
 * @author: Mitnick
 * @date: 2017-08-21 14:40
 */
public class AccountUnknownException extends AuthenticationException {
    public AccountUnknownException() {
        super();
    }

    public AccountUnknownException(String message) {
        super(message);
    }

    public AccountUnknownException(Throwable cause) {
        super(cause);
    }

    public AccountUnknownException(String message, Throwable cause) {
        super(message, cause);
    }
}
