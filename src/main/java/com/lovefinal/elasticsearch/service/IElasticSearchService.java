package com.lovefinal.elasticsearch.service;

import org.elasticsearch.client.RestHighLevelClient;

public interface IElasticSearchService {
    RestHighLevelClient getClient();
}
