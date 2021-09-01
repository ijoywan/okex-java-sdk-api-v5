package com.haoshuashua.okex.bean.subAccount.param;

import lombok.Data;

@Data
public class DelSunAccountApikey {
    private String pwd;
    private String subAcct;
    private String apiKey;

    @Override
    public String toString() {
        return "DelSunAccountApikey{" +
                "pwd='" + pwd + '\'' +
                ", subAcct='" + subAcct + '\'' +
                ", apiKey='" + apiKey + '\'' +
                '}';
    }
}
