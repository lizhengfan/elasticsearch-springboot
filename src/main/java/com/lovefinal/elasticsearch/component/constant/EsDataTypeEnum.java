package com.lovefinal.elasticsearch.component.constant;

public enum EsDataTypeEnum {
    STRING("string"),
    TEXT("text"),
    KEYWORD("keyword"),
    INTEGER("integer"),
    LONG("long"),
    SHORT("short"),
    BYTE("byte"),
    DOUBLE("double"),
    HALF_FLOAT("half_float"),
    SCALED_FLOAT("scaled_float"),
    DATE("date"),
    RANGE("range"),
    BINARY("binary"),
    ARRAY("array"),
    OBJECT("object"),
    NESTED("nested"),
    GEO_POINT("geo_point"),
    GEO_SHAPE("geo_shape"),
    IP("ip"),
    COMPLETION("completion"),
    TOKEN_COUNT("token_count"),
    ATTACHMENT("attachment"),
    PERCOLATOR("percolator");


    private final String type;

    private EsDataTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
