package com.haoshuashua.okex.bean.subAccount.param;

import lombok.Data;

@Data
public class ReSetSubAccountApikey {

    private String pwd;
    private String subAcct;
    private String label;
    private String apiKey;
    private String perm;
    private String ip;

    @Override
    public String toString() {
        return "ReSetSubAccountApikey{" +
                "pwd='" + pwd + '\'' +
                ", subAcct='" + subAcct + '\'' +
                ", label='" + label + '\'' +
                ", apiKey='" + apiKey + '\'' +
                ", perm='" + perm + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
