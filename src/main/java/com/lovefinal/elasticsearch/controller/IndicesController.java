package com.lovefinal.elasticsearch.controller;

import com.lovefinal.elasticsearch.component.dto.ResultDTO;
import com.lovefinal.elasticsearch.component.model.IndicesModel;
import com.lovefinal.elasticsearch.service.IIndicesService;
import com.lovefinal.elasticsearch.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 索引控制器
 * @ClassName IndicesController
 * @Author lizhengfan
 * @Date 2019/5/22 10:49
 * @Version 1.0.0
 */
@RestController
@RequestMapping(value = "/indices", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "索引控制器")
public class IndicesController extends BaseController {

    @Autowired
    IIndicesService indicesService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ApiOperation(value = "创建索引", notes = "创建索引")
    public ResultDTO create(@RequestBody IndicesModel model) {
        Integer data = indicesService.create(model);
        return ResultUtil.formatResult(data);
    }
}
