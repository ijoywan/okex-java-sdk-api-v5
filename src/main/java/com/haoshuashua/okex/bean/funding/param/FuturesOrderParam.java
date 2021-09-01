package com.haoshuashua.okex.bean.funding.param;

import lombok.Data;

@Data
public class FuturesOrderParam {
    //公共参数
    private String instrument_id;
    private String type;
    private String order_type;
    private String size;
    //计划委托
    private String trigger_price;
    private String algo_price;

    private String algo_type;
    //跟踪委托
    private String callback_rate;
    //冰山委托
    private String algo_variance;
    private String avg_amount;
    private String price_limit;
    //时间加权委托
    private String sweep_range;
    private String sweep_ratio;
    private String single_limit;
    private String time_interval;
    //止盈止损
    private String tp_trigger_price;
    private String tp_price;
    private String tp_trigger_type;
    private String sl_trigger_type;
    private String sl_trigger_price;
    private String sl_price;

}
