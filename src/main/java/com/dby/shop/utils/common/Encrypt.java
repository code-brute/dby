package com.dby.shop.utils.common;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @Description:
 * @Author: mitnick
 * @Date: 2017-10-11 下午10:12
 */
public class Encrypt {

    private static RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    private static final String ALGORITHM_NAME = "md5";
    private static final int HASH_ITERATIONS = 2;

    public static String encrypt(String password,String credentialsSalt) {
        return new SimpleHash(
                ALGORITHM_NAME,
                password,
                ByteSource.Util.bytes(credentialsSalt),
                HASH_ITERATIONS).toHex();

    }

    public static void main(String[] args) {
        System.out.println(encrypt("e10adc3949ba59abbe56e057f20f883e", "b44a01002f6efd56ecfdf1ab4cd075c5songhui"));
    }
}
