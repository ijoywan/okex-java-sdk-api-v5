package com.haoshuashua.okex.bean.account.param;

import lombok.Data;

@Data
public class SetPositionMode {

    private String posMode;

    @Override
    public String toString() {
        return "SetPositionMode{" +
                "posMode='" + posMode + '\'' +
                '}';
    }



}
