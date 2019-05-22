package com.lovefinal.elasticsearch.service;

import com.lovefinal.elasticsearch.component.model.IndicesModel;
import com.lovefinal.elasticsearch.utils.ExceptionUtil;

public interface IIndicesService {
    //创建索引文档
    Integer  create(IndicesModel model) throws ExceptionUtil;
}