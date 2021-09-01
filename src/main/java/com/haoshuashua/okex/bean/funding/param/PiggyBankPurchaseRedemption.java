package com.haoshuashua.okex.bean.funding.param;

import lombok.Data;

@Data
public class PiggyBankPurchaseRedemption {
    private String ccy;
    private String amt;
    private String side;

    @Override
    public String toString() {
        return "PiggyBankPurchaseRedemption{" +
                "ccy='" + ccy + '\'' +
                ", amt='" + amt + '\'' +
                ", side='" + side + '\'' +
                '}';
    }
}
