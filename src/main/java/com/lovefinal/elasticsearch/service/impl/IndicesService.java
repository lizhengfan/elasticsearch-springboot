package com.lovefinal.elasticsearch.service.impl;

import com.lovefinal.elasticsearch.component.constant.ErrorEnum;
import com.lovefinal.elasticsearch.component.constant.HttpEnum;
import com.lovefinal.elasticsearch.component.model.IndicesModel;
import com.lovefinal.elasticsearch.entity.Indices;
import com.lovefinal.elasticsearch.repository.IndicesRepository;
import com.lovefinal.elasticsearch.service.IElasticSearchService;
import com.lovefinal.elasticsearch.service.IIndicesService;
import com.lovefinal.elasticsearch.utils.ExceptionUtil;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.settings.Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

    @Autowired
    IElasticSearchService elasticSearchService;

    @Override
    public Integer create(IndicesModel model) throws ExceptionUtil {
        Map<String, Map<String, Object>> fieldMap = model.getsFields();

        CreateIndexRequest request = new CreateIndexRequest(model.getsIndex());

        Settings.Builder settingBuilder = Settings.builder();
        Integer shards = model.getiShards();
        Integer replicas = model.getiReplicas();

        if (shards != null && shards > 0) {
            settingBuilder.put("index.number_of_shards", shards);
        }

        if (replicas != null && replicas > 0) {
            settingBuilder.put("index.number_of_replicas", replicas);
        }

        request.settings(settingBuilder);

        //添加两个属性
        Map<String, Object> properties = new HashMap<>();
        for (Map.Entry<String, Map<String, Object>> entry : fieldMap.entrySet()) {
            properties.put(entry.getKey(), entry.getValue());
        }

        Map<String, Object> mapping = new HashMap<>();
        mapping.put("properties", properties);
        request.mapping(model.getsType(), mapping);

        RestHighLevelClient client = elasticSearchService.getClient();

        CreateIndexResponse createIndexResponse = null;
        try {
            createIndexResponse = client.indices().create(request, RequestOptions.DEFAULT);
        } catch (IOException e) {
            throw new ExceptionUtil(ErrorEnum.CREATEINDICESERROR.getValue(), e.getCause(), HttpEnum.SERVERERROR.getCode(), ErrorEnum.CREATEINDICESERROR);
        }


        //记录到本地数据库
        if (createIndexResponse.isAcknowledged()) {
            Indices indices = new Indices(model);
            try {
                indicesRepository.save(indices);
            } catch (RuntimeException e) {
                throw new ExceptionUtil(ErrorEnum.CREATEINDICESERROR.getValue(), e.getCause(), HttpEnum.SQLERROR.getCode(), ErrorEnum.CREATEINDICESERROR);
            }

            return 1;
        }
        return 0;
    }


}
