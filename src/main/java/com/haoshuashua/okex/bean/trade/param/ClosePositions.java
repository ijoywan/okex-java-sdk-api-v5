package com.haoshuashua.okex.bean.trade.param;

import lombok.Data;

@Data
public class ClosePositions {
    private String instId;
    private String posSide;
    private String mgnMode;
    private String ccy;

    @Override
    public String toString() {
        return "ClosePositions{" +
                "instId='" + instId + '\'' +
                ", posSide='" + posSide + '\'' +
                ", mgnMode='" + mgnMode + '\'' +
                ", ccy='" + ccy + '\'' +
                '}';
    }
}
