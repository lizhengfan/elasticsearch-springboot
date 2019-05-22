package com.lovefinal.elasticsearch.controller;

import com.lovefinal.elasticsearch.component.dto.ResultDTO;
import com.lovefinal.elasticsearch.component.model.IndicesModel;
import com.lovefinal.elasticsearch.service.IIndicesService;
import com.lovefinal.elasticsearch.utils.ExceptionUtil;
import com.lovefinal.elasticsearch.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 文档控制器
 * @ClassName IndicesController
 * @Author lizhengfan
 * @Date 2019/5/22 10:49
 * @Version 1.0.0
 **/
@RestController
@RequestMapping(value = "/indices", produces = MediaType.APPLICATION_JSON_VALUE)
public class IndicesController extends BaseController {
    @Autowired
    IIndicesService indicesService;

    @RequestMapping(value = "/create", method = RequestMethod.PUT)
    public ResultDTO create(IndicesModel model) {
        Integer data=indicesService.create(model);
        return ResultUtil.formatResult(data);
    }
}
