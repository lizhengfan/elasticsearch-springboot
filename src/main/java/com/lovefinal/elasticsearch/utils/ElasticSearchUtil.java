package com.lovefinal.elasticsearch.utils;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

/**
 * @Description ElasticSearch工具类
 * @ClassName ElasticSearchUtil
 * @Author lizhengfan
 * @Date 2019/5/21 16:40
 * @Version 1.0.0
 **/
public class ElasticSearchUtil {
    /**
     * @Description 获取elsticsearch客户端
     * @Author lizhengfan
     * @Date 2019/5/21 16:47
     * @Param
     * @Return org.elasticsearch.client.RestHighLevelClient
     **/
    public static RestHighLevelClient getElasticSearchClient() {
        RestHighLevelClient client = new RestHighLevelClient(
            RestClient.builder(new HttpHost("139.159.247.209", 9200, "http")));
        return client;
    }
}
