package com.haoshuashua.okex.bean.trade.param;

import lombok.Data;

@Data
public class AmendOrder {
    private String instId;
    private Boolean cxlOnFail;
    private String ordId;
    private String clOrdId;
    private String reqId;
    private String newSz;
    private String newPx;

    @Override
    public String toString() {
        return "AmendOrder{" +
                "instId='" + instId + '\'' +
                ", cxlOnFail=" + cxlOnFail +
                ", ordId='" + ordId + '\'' +
                ", clOrdId='" + clOrdId + '\'' +
                ", reqId='" + reqId + '\'' +
                ", newSz='" + newSz + '\'' +
                ", newPx='" + newPx + '\'' +
                '}';
    }
}
