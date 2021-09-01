package com.haoshuashua.okex.exception;

public class APIKeyException extends APIException {
    public APIKeyException(String message) {
        super(message);
    }

    public APIKeyException(int code, String message) {
        super(code,message);
    }

    public APIKeyException(Throwable cause) {
        super(cause);
    }

    public APIKeyException(String message, Throwable cause) {
        super(message, cause);
    }


}
