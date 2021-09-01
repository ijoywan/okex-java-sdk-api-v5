package com.haoshuashua.okex.bean.trade.param;

import lombok.Data;

@Data
public class CancelOrder {
    private String instId;
    private String ordId;
    private String clOrdId;

    @Override
    public String toString() {
        return "CancelOrder{" +
                "instId='" + instId + '\'' +
                ", ordId='" + ordId + '\'' +
                ", clOrdId='" + clOrdId + '\'' +
                '}';
    }
}
