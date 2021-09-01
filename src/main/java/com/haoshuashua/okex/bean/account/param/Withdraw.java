package com.haoshuashua.okex.bean.account.param;

import lombok.Data;

@Data
public class Withdraw {
    private String amount;

    private String currency;

    private String destination;

    private String to_address;

    private String trade_pwd;

    private String fee;

    private String tag;
}
