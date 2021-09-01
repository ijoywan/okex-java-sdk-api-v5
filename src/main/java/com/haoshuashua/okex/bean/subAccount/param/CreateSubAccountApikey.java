package com.haoshuashua.okex.bean.subAccount.param;

import lombok.Data;

@Data
public class CreateSubAccountApikey {
    private String pwd;
    private String subAcct;
    private String label;
    private String Passphrase;
    private String perm;
    private String ip;

    @Override
    public String toString() {
        return "CreateSubAccountApikey{" +
                "pwd='" + pwd + '\'' +
                ", subAcct='" + subAcct + '\'' +
                ", label='" + label + '\'' +
                ", Passphrase='" + Passphrase + '\'' +
                ", perm='" + perm + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
