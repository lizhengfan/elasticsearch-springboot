package com.lovefinal.elasticsearch.service.impl;

import com.lovefinal.elasticsearch.component.constant.ErrorEnum;
import com.lovefinal.elasticsearch.component.constant.HttpEnum;
import com.lovefinal.elasticsearch.component.model.DocumentModel;
import com.lovefinal.elasticsearch.repository.DocumentRepository;
import com.lovefinal.elasticsearch.service.IDocumentService;
import com.lovefinal.elasticsearch.service.IElasticSearchService;
import com.lovefinal.elasticsearch.utils.ExceptionUtil;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @Description TODO
 * @ClassName DocumentService
 * @Author lizhengfan
 * @Date 2019/5/23 17:31
 * @Version 1.0.0
 **/

@Service
public class DocumentService implements IDocumentService {
    @Autowired
    IElasticSearchService elasticSearchService;

    @Autowired
    DocumentRepository documentRepository;

    @Override
    public int create(DocumentModel model) throws ExceptionUtil {
        RestHighLevelClient client = elasticSearchService.getClient();
        String sID = model.getsID();
        if (sID == null || sID.length() == 0) {
            sID = DateTime.now().toString();
        }

        IndexRequest request = new IndexRequest(model.getsIndex(), model.getsType(), sID).source(model.getsFields());
        IndexResponse indexResponse = null;
        try {
            indexResponse = client.index(request, RequestOptions.DEFAULT);
            return 1;
        } catch (IOException e) {
            throw new ExceptionUtil(ErrorEnum.CREATEDOCUMENTERROR.getValue(), e.getCause(), HttpEnum.SERVERERROR.getCode(), ErrorEnum.CREATEDOCUMENTERROR);
        }
    }
}
