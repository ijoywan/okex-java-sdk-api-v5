package com.haoshuashua.okex.bean.funding.param;

import com.haoshuashua.okex.enums.FuturesTransactionTypeEnum;
import lombok.Data;

@Data
public class OrdersItem {

    /**
     * You setting order id. (optional)
     */
    private String order_type;
    private String price;

    private String client_oid;
    /**
     * The execution type {@link FuturesTransactionTypeEnum}
     */
    private String type;
    /**
     * The order price: Maximum 1 million
     */

    /**
     * The order amount: Maximum 1 million
     */
    private String size;
    /**
     * Match best counter party price (BBO)? 0: No 1: Yes   If yes, the 'price' field is ignored
     */
    private String match_price;
}
