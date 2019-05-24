package com.lovefinal.elasticsearch.service.impl;

import com.lovefinal.elasticsearch.configuration.ElasticSearchConfigration;
import com.lovefinal.elasticsearch.service.IElasticSearchService;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description TODO
 * @ClassName ElasticSearchService
 * @Author lizhengfan
 * @Date 2019/5/23 14:44
 * @Version 1.0.0
 **/
@Service
public class ElasticSearchService implements IElasticSearchService {
    @Autowired
    ElasticSearchConfigration elasticSearchConfigration;

    @Override
    public RestHighLevelClient getClient() {
        RestHighLevelClient client=null;
        List<HttpHost> hostList=new ArrayList<>();
        for (Map.Entry<String,Integer> entry : elasticSearchConfigration.getHost().entrySet()) {
             String hostname=entry.getKey();
             Integer hostport=entry.getValue();

             HttpHost host =new HttpHost(hostname, hostport, "http");
             hostList.add(host);
        }

        HttpHost[] hostArray= new HttpHost[hostList.size()];
        hostList.toArray(hostArray);

        RestClientBuilder restClientBuilder= RestClient.builder(hostArray);
        client= new RestHighLevelClient(restClientBuilder);
        return client;
    }
}
