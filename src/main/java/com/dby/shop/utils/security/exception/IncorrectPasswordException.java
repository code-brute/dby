package com.dby.shop.utils.security.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @Description:密码错误异常
 * @author: Mitnick
 * @date: 2017-08-21 14:40
 */
public class IncorrectPasswordException extends AuthenticationException {
    public IncorrectPasswordException() {
        super();
    }

    public IncorrectPasswordException(String message) {
        super(message);
    }

    public IncorrectPasswordException(Throwable cause) {
        super(cause);
    }

    public IncorrectPasswordException(String message, Throwable cause) {
        super(message, cause);
    }
}
