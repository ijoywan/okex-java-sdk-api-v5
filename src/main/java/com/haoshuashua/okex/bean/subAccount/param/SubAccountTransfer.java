package com.haoshuashua.okex.bean.subAccount.param;

import lombok.Data;

@Data
public class SubAccountTransfer {
    private String ccy;
    private String amt;
    private String form;
    private String to;
    private String fromSubAccount;
    private String toSubAccount;

    @Override
    public String toString() {
        return "SubAccountTransfer{" +
                "ccy='" + ccy + '\'' +
                ", amt='" + amt + '\'' +
                ", form='" + form + '\'' +
                ", to='" + to + '\'' +
                ", fromSubAccount='" + fromSubAccount + '\'' +
                ", toSubAccount='" + toSubAccount + '\'' +
                '}';
    }
}
