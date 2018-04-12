package com.dby.shop.utils.security.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @author: Breg
 * @Date: Created in 下午3:21 2018/2/27
 */
public class LoginUserRepeatException extends AuthenticationException {

    public LoginUserRepeatException() {
        super();
    }

    public LoginUserRepeatException(String message) {
        super(message);
    }

    public LoginUserRepeatException(Throwable cause) {
        super(cause);
    }

    public LoginUserRepeatException(String message, Throwable cause) {
        super(message, cause);
    }
}
