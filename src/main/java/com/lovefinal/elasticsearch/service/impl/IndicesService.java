package com.lovefinal.elasticsearch.service.impl;

import com.lovefinal.elasticsearch.Repository.IndicesRepository;
import com.lovefinal.elasticsearch.component.model.IndicesModel;
import com.lovefinal.elasticsearch.service.IIndicesService;
import com.lovefinal.elasticsearch.utils.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @ClassName IndicesService
 * @Author lizhengfan
 * @Date 2019/5/22 15:30
 * @Version 1.0.0
 **/
@Service
public class IndicesService implements IIndicesService {
    @Autowired
    IndicesRepository indicesRepository;

    @Override
    public Integer create(IndicesModel model) throws ExceptionUtil {
        return 0;
    }
}
