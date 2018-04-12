package com.dby.shop.utils.security.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @Description:验证码异常
 * @author: Mitnick
 * @date: 2017-08-21 14:40
 */
public class IncorrectCaptchaException extends AuthenticationException {
    public IncorrectCaptchaException() {
        super();
    }

    public IncorrectCaptchaException(String message) {
        super(message);
    }

    public IncorrectCaptchaException(Throwable cause) {
        super(cause);
    }

    public IncorrectCaptchaException(String message, Throwable cause) {
        super(message, cause);
    }
}