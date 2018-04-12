package com.dby.shop.utils.security.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @Description:
 * @Author: Mitnick
 * @Date: 2017-08-23 18:45
 */
public class InactivePasswordException extends AuthenticationException {
    public InactivePasswordException() {
    }

    public InactivePasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public InactivePasswordException(String message) {
        super(message);
    }

    public InactivePasswordException(Throwable cause) {
        super(cause);
    }
}