package com.lovefinal.elasticsearch.component.constant;

import io.swagger.models.auth.In;

public enum HttpEnum {
    SUCCESS(200),
    PATHERROR(404),
    BUSINNESSERROR(409),
    PARAMSERROR(422),
    SERVERERROR(500),
    SQLERROR(503);

    private final Integer code;

    private HttpEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
