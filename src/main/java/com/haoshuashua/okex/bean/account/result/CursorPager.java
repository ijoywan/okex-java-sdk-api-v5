package com.haoshuashua.okex.bean.account.result;

import lombok.Data;

import java.util.List;

/**
 * @author chuping.cui
 * @date 2018/7/5
 */
@Data
public class CursorPager<T> {

    private List<T> data;
    private String before;
    private String after;
    private int limit;
}
