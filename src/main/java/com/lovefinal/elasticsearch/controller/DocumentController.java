package com.lovefinal.elasticsearch.controller;

import com.lovefinal.elasticsearch.component.dto.ResultDTO;
import com.lovefinal.elasticsearch.component.model.DocumentModel;
import com.lovefinal.elasticsearch.service.IDocumentService;
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
 * @Description 文档控制器
 * @ClassName DocumentController
 * @Author lizhengfan
 * @Date 2019/5/22 10:49
 * @Version 1.0.0
 **/
@RestController
@RequestMapping(value = "/document", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "文档控制器")
public class DocumentController extends BaseController {

    @Autowired
    IDocumentService documentService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ApiOperation(value = "创建文档", notes = "创建文档")
    public ResultDTO create(@RequestBody DocumentModel model) {
        Integer data = documentService.create(model);
        return ResultUtil.formatResult(data);
    }
}
