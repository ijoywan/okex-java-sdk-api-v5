package com.haoshuashua.okex.bean.account.param;

import lombok.Data;

@Data
public class IncreaseDecreaseMargin {
    private String instId;
    private String posSide;
    private String type;
    private String amt;

    @Override
    public String toString() {
        return "IncreaseDecreaseMargin{" +
                "instId='" + instId + '\'' +
                ", posSide='" + posSide + '\'' +
                ", type='" + type + '\'' +
                ", amt='" + amt + '\'' +
                '}';
    }
}
