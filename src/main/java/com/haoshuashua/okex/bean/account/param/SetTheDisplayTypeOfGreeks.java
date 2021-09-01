package com.haoshuashua.okex.bean.account.param;

import lombok.Data;

@Data
public class SetTheDisplayTypeOfGreeks {
    private String greeksType;

    @Override
    public String toString() {
        return "SetTheDisplayTypeOfGreeks{" +
                "greeksType='" + greeksType + '\'' +
                '}';
    }
}
