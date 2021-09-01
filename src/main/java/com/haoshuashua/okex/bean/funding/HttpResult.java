package com.haoshuashua.okex.bean.funding;

import lombok.Data;

@Data
public class HttpResult {

    private int code;
    private String message;
    private String msg;
    private int errorCode;
    private String errorMessage;
    private String order_id;
    private Boolean result;

    @Override
    public String toString() {
        return "HttpResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", msg='" + msg + '\'' +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", order_id='" + order_id + '\'' +
                ", result=" + result +
                '}';
    }
}