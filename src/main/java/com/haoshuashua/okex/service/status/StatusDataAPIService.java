package com.haoshuashua.okex.service.status;

import com.alibaba.fastjson.JSONObject;

public interface StatusDataAPIService {

    //Status
    JSONObject getStatus(String state);
}
