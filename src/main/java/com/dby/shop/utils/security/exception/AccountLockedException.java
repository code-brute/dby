package com.dby.shop.utils.security.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @Description:账号被锁定异常
 * @author: Mitnick
 * @date: 2017-08-21 14:40
 */
public class AccountLockedException extends AuthenticationException {
    public AccountLockedException() {
        super();
    }

    public AccountLockedException(String message) {
        super(message);
    }

    public AccountLockedException(Throwable cause) {
        super(cause);
    }

    public AccountLockedException(String message, Throwable cause) {
        super(message, cause);
    }
}