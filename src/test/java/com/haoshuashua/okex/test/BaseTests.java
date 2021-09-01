package com.haoshuashua.okex.test;

import com.alibaba.fastjson.JSON;
import com.haoshuashua.okex.config.APIConfiguration;
import org.slf4j.Logger;
import com.haoshuashua.okex.enums.I18nEnum;

public class BaseTests {

    public APIConfiguration config;

    public void toResultString(Logger log, String flag, Object object) {
        StringBuilder su = new StringBuilder();
        su.append("\n").append("=====>").append(flag).append(":\n").append(JSON.toJSONString(object));
        System.out.println(su.toString());
    }

    public APIConfiguration config()
    {
        APIConfiguration config = new APIConfiguration();
        config.setEndpoint("https://www.okex.com/");
        // apiKey，api注册成功后页面上有
        config.setApiKey("b70c80c1-7e4b-4939-9d92-b21cab0c686f");
        config.setSecretKey("BF4EE89F708733DCCE6FF7A04DE44BDF");
        config.setPassphrase("Y7sDTAWNVItUtGa0TQZArWUfEoow312R");

        config.setPrint(true);
        config.setI18n(I18nEnum.SIMPLIFIED_CHINESE);
        config.setI18n(I18nEnum.ENGLISH);

        return config;
    }
}
