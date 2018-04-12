package com.dby.shop.utils.security.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @Description: 账号被禁用异常
 * @author: Mitnick
 * @date: 2017-08-21 14:38
 */
public class AccountDisabledException extends AuthenticationException {
    public AccountDisabledException() {
        super();
    }

    public AccountDisabledException(String message) {
        super(message);
    }

    public AccountDisabledException(Throwable cause) {
        super(cause);
    }

    public AccountDisabledException(String message, Throwable cause) {
        super(message, cause);
    }
}
