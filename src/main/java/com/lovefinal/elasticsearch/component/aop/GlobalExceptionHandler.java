package com.lovefinal.elasticsearch.component.aop;

import com.lovefinal.elasticsearch.component.dto.ResultDTO;
import com.lovefinal.elasticsearch.utils.ExceptionUtil;
import com.lovefinal.elasticsearch.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Description TODO
 * @ClassName GlobalExceptionHandler
 * @Author lizhengfan
 * @Date 2019/5/22 18:17
 * @Version 1.0.0
 **/
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = ExceptionUtil.class)  //处理所有的异常
    public ResultDTO exceptionHandle(ExceptionUtil exception){
       return ResultUtil.formatResult(exception);
    }
}
