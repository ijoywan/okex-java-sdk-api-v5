package com.haoshuashua.okex.test.status;


import com.alibaba.fastjson.JSONObject;
import com.haoshuashua.okex.service.status.StatusDataAPIService;
import com.haoshuashua.okex.service.status.impl.StatusDataAPIServiceImpl;
import com.haoshuashua.okex.test.BaseTests;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StatusDataAPITest extends BaseTests {

    private static final Logger LOG = LoggerFactory.getLogger(StatusDataAPITest.class);
    private StatusDataAPIService statusDataAPIService;

    @Before
    public void before() {
        config = config();
        statusDataAPIService = new StatusDataAPIServiceImpl(config);
    }


    /**
     * status
     * GET /api/v5/system/status
     */
    @Test
    public void testGetStatus(){
        JSONObject result = statusDataAPIService.getStatus(null);
        this.toResultString(StatusDataAPITest.LOG, "result", result);
        // 服务类型， 0：WebSocket ; 1：币币 ; 2：交割 ; 3：永续 ; 4：期权 5：交易服务
        // 系统，classic：经典账户， unified：统一账户
    }
}
