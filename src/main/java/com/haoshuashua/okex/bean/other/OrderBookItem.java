package com.haoshuashua.okex.bean.other;

import java.math.BigDecimal;

public interface OrderBookItem<T> {
    String getPrice();

    T getSize();
}
