package com.haoshuashua.okex.bean.trade.param;

import lombok.Data;

@Data
public class PlaceOrder {
    private String instId;
    private String tdMode;
    private String ccy;
    private String clOrdId;
    private String tag;
    private String side;
    private String posSide;
    private String ordType;
    private String sz;
    private String px;
    private Boolean reduceOnly;


    @Override
    public String toString() {
        return "PlaceOrder{" +
                "instId='" + instId + '\'' +
                ", tdMode='" + tdMode + '\'' +
                ", ccy='" + ccy + '\'' +
                ", clOrdId='" + clOrdId + '\'' +
                ", tag='" + tag + '\'' +
                ", side='" + side + '\'' +
                ", posSide='" + posSide + '\'' +
                ", ordType='" + ordType + '\'' +
                ", sz='" + sz + '\'' +
                ", px='" + px + '\'' +
                ", reduceOnly='" + reduceOnly + '\'' +
                '}';
    }
}
