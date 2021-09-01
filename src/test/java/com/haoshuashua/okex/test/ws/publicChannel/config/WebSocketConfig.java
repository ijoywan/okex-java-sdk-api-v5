package com.haoshuashua.okex.test.ws.publicChannel.config;

public class WebSocketConfig {
    //ws  模拟盘
//    private static final String SERVICE_URL = "wss://ws.okex.com:8443/ws/v5/public?brokerId=9999";
    //ws  实盘
    private static final String SERVICE_URL = "wss://ws.okex.com:8443/ws/v5/public";

    // 实盘api key
    private static final String API_KEY = "b70c80c1-7e4b-4939-9d92-b21cab0c686f";
    private static final String SECRET_KEY = "BF4EE89F708733DCCE6FF7A04DE44BDF";
    private static final String PASSPHRASE = "Y7sDTAWNVItUtGa0TQZArWUfEoow312R";



    public static void publicConnect(WebSocketClient webSocketClient) {
        System.out.println(SERVICE_URL);
        WebSocketClient.connection(SERVICE_URL);
    }

    public static void loginConnect(WebSocketClient webSocketClient) {
        System.out.println(SERVICE_URL);
        //与服务器建立连接
        WebSocketClient.connection(SERVICE_URL);
        //登录账号,用户需提供 api-key，passphrase,secret—key 不要随意透漏 ^_^
        WebSocketClient.login(API_KEY , PASSPHRASE , SECRET_KEY);

    }
}
