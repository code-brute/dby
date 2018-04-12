package com.dby.shop.utils.security.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @Description:密码错误异常
 * @author: Berg
 * @date: 2017-10-26 14:40
 */
public class ErrorPasswordException extends AuthenticationException {

    public ErrorPasswordException() {
        super();
    }

    public ErrorPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorPasswordException(String message) {
        super(message);
    }

    public ErrorPasswordException(Throwable cause) {
        super(cause);
    }
}
