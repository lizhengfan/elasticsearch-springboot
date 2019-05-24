package com.lovefinal.elasticsearch.utils;

import com.lovefinal.elasticsearch.component.constant.EsDataTypeEnum;

/**
 * @Description TODO
 * @ClassName EsDataTypeUtil
 * @Author lizhengfan
 * @Date 2019/5/24 16:52
 * @Version 1.0.0
 **/
public class EsDataTypeUtil {
    public static String formatType(String type) {
        if (type.equals("int")) {
            return EsDataTypeEnum.INTEGER.getType();
        }

        return type;
    }
}
