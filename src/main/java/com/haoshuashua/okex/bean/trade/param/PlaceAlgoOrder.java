package com.haoshuashua.okex.bean.trade.param;

import lombok.Data;

@Data
public class PlaceAlgoOrder {
    private String instId;
    private String tdMode;
    private String ccy;
    private String side;
    private String posSide;
    private String ordType;
    private String sz;
    private Boolean reduceOnly;


    private String tpTriggerPx;
    private String tpOrdPx;
    private String slTriggerPx;
    private String slOrdPx;

    private String triggerPx;
    private String orderPx;

}
