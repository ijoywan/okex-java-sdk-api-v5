package com.haoshuashua.okex.bean.funding.param;

import lombok.Data;

@Data
public class FundsTransfer {
    private String ccy;
    private String amt;
    private String type;
    private String from;
    private String to;
    private String subAcct;
    private String instId;
    private String toInstId;

    @Override
    public String toString() {
        return "FundsTransfer{" +
                "ccy='" + ccy + '\'' +
                ", amt='" + amt + '\'' +
                ", type='" + type + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subAcct='" + subAcct + '\'' +
                ", instId='" + instId + '\'' +
                ", toInstId='" + toInstId + '\'' +
                '}';
    }
}
