package com.lovefinal.elasticsearch.component.dto;

public class ResultDTO<T> {

    private int code;       //http结果代码
    private String message; //具体的业务信息
    private String status;  //具体的业务状态码
    private T data;         //具体的数据

    public ResultDTO(int code, String message, String status, T data) {
        this.code = code;
        this.message = message;
        this.status = status;
        this.data = data;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
