package com.dby.shop.config.base;

import java.io.Serializable;

/**
 * @Description:
 * @author: mitnick
 * @Date: 2017-09-12 上午9:14
 */
public class ResultBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final int SUCCESS = 200;

    private static final int FAIL = 404;

    private String msg;

    private int code = SUCCESS;


    private T data;

    public ResultBean() {
        super();
    }

    public ResultBean(T data) {
        super();
        this.data = data;

    }

    public ResultBean(Throwable e) {
        super();
        this.msg = e.toString();
        this.code = FAIL;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
