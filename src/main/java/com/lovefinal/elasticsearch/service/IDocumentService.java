package com.lovefinal.elasticsearch.service;

import com.lovefinal.elasticsearch.component.model.DocumentModel;
import com.lovefinal.elasticsearch.utils.ExceptionUtil;

public interface IDocumentService {
    int create(DocumentModel model) throws ExceptionUtil;
}
