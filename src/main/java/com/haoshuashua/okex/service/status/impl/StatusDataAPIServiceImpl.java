package com.haoshuashua.okex.service.status.impl;

import com.alibaba.fastjson.JSONObject;
import com.haoshuashua.okex.client.APIClient;
import com.haoshuashua.okex.config.APIConfiguration;
import com.haoshuashua.okex.service.status.StatusDataAPIService;

public class StatusDataAPIServiceImpl implements StatusDataAPIService {

    private final APIClient client;
    private final StatusDataAPI statusDataAPI;

    public StatusDataAPIServiceImpl(final APIConfiguration config) {
        this.client = new APIClient(config);
        this.statusDataAPI = this.client.createService(StatusDataAPI.class);
    }

    //status
    @Override
    public JSONObject getStatus(String state) {
        return this.client.executeSync(this.statusDataAPI.getStatus(state));
    }
}
