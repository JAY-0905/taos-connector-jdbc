package com.taosdata.jdbc.ws.schemaless;

import com.taosdata.jdbc.ws.entity.Response;

public class CommonResp extends Response {

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
