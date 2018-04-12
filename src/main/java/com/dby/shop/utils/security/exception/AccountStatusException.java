package com.dby.shop.utils.security.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @Description:账号状态异常
 * @author: Mitnick
 * @date: 2017-08-21 14:40
 */
public class AccountStatusException extends AuthenticationException {
    public AccountStatusException() {
        super();
    }

    public AccountStatusException(String message) {
        super(message);
    }

    public AccountStatusException(Throwable cause) {
        super(cause);
    }

    public AccountStatusException(String message, Throwable cause) {
        super(message, cause);
    }
}
