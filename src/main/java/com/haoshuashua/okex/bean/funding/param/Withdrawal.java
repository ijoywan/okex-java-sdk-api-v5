package com.haoshuashua.okex.bean.funding.param;

import lombok.Data;

@Data
public class Withdrawal {
    private String ccy;
    private String amt;
    private String dest;
    private String toAddr;
    private String pwd;
    private String fee;

    @Override
    public String toString() {
        return "Withdrawal{" +
                "ccy='" + ccy + '\'' +
                ", amt='" + amt + '\'' +
                ", dest='" + dest + '\'' +
                ", toAddr='" + toAddr + '\'' +
                ", pwd='" + pwd + '\'' +
                ", fee='" + fee + '\'' +
                '}';
    }
}
