package com.lovefinal.elasticsearch.utils;

import com.lovefinal.elasticsearch.component.constant.ErrorEnum;

import java.util.Map;

public class ExceptionUtil extends RuntimeException {
    Integer httpCode;
    ErrorEnum errorEnum;


    public ExceptionUtil(ErrorEnum errorEnum,Integer httpCode) {
        this.errorEnum = errorEnum;
        this.httpCode=httpCode;
    }

    public ExceptionUtil(String message, ErrorEnum errorEnum,Integer httpCode) {
        super(message);
        this.errorEnum = errorEnum;
        this.httpCode=httpCode;
    }

    public ExceptionUtil(String message, Throwable cause, Integer httpCode, ErrorEnum errorEnum) {
        super(message, cause);
        this.httpCode = httpCode;
        this.errorEnum = errorEnum;
    }
}
