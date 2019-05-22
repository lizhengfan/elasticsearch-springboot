package com.lovefinal.elasticsearch.utils;

import com.lovefinal.elasticsearch.component.constant.HttpEnum;
import com.lovefinal.elasticsearch.component.dto.ResultDTO;

/**
 * @Description TODO
 * @ClassName ResultUtil
 * @Author lizhengfan
 * @Date 2019/5/22 17:34
 * @Version 1.0.0
 **/
public class ResultUtil {
    public static ResultDTO formatResult(Object data){
        ExceptionUtil exception=null;
        if(data.getClass().equals(ExceptionUtil.class)){
            exception=(ExceptionUtil) data;
        }

        ResultDTO<Object> resultDTO=null;
        if(exception==null){
            resultDTO=new ResultDTO<Object>(HttpEnum.SUCCESS.getCode(),null,null,data);
        }else{
            int code=exception.httpCode;
            String message=exception.errorEnum.getValue();
            String status=exception.errorEnum.getKey();
            resultDTO=new ResultDTO<Object>(code,message,status,null);
        }

        return  resultDTO;
    }
}
