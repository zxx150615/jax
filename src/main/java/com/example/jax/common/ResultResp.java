package com.example.jax.common;

import java.io.Serializable;

public class ResultResp<T> {

    public static final Integer SUCCESS = 0;
    public static final Integer FAIL = 1;
    private Integer code;
    private String msg;
    private T data;

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public ResultResp() {
        this.code = 0;
        this.msg = "";
    }

    public ResultResp(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultResp(T data) {
        this(0, "", data);
    }

    public static ResultResp builder() {
        return new ResultResp();
    }

    public static ResultResp builderSuccess() {
        ResultResp resp = builder();
        resp.setCode(SUCCESS);
        resp.setMsg("");
        return resp;
    }

    public static ResultResp builderSuccess(String msg) {
        ResultResp resp = builder();
        resp.setCode(SUCCESS);
        resp.setMsg(msg);
        return resp;
    }

    public static ResultResp builderSuccess(String msg, Object data) {
        ResultResp resp = builder();
        resp.setMsg(msg);
        resp.setCode(SUCCESS);
        resp.setData(data);
        return resp;
    }

    public static ResultResp builderFailure(String msg) {
        ResultResp resp = builder();
        resp.setMsg(msg);
        resp.setCode(FAIL);
        return resp;
    }

    public static ResultResp builderFailure(Integer code, String msg) {
        ResultResp resp = builder();
        resp.setCode(code);
        resp.setMsg(msg);
        return resp;
    }
}
