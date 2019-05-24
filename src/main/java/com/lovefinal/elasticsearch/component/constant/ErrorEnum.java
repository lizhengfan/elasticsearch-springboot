package com.lovefinal.elasticsearch.component.constant;

public enum ErrorEnum {
    SUCCESS("10000", "操作成功"),
    CREATEINDICESERROR("10001", "创建索引异常"),
    CREATEDOCUMENTERROR("10002", "创建文档异常"),
    FAILURE("99999", "操作失败");

    private final String key;
    private final String value;

    private ErrorEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    //根据key获取枚举
    public static ErrorEnum getEnumByKey(String key) {
        if (null == key) {
            return null;
        }
        for (ErrorEnum temp : ErrorEnum.values()) {
            if (temp.getKey().equals(key)) {
                return temp;
            }
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
