package com.haoshuashua.okex.client;

import com.haoshuashua.okex.config.APIConfiguration;
import lombok.Data;


@Data
public class APICredentials {
    /**
     * The user's secret key provided by OKEx.
     */
    private String apiKey;
    /**
     * The private key used to sign your request data.
     */
    private String secretKey;
    /**
     * The Passphrase will be provided by you to further secure your API access.
     */
    private String passphrase;


    public APICredentials(APIConfiguration config) {
        super();
        this.apiKey = config.getApiKey();
        this.secretKey = config.getSecretKey();
        this.passphrase = config.getPassphrase();
    }
}
