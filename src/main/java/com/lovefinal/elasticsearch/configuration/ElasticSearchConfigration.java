package com.lovefinal.elasticsearch.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description TODO
 * @ClassName ElasticSearchConfigration
 * @Author lizhengfan
 * @Date 2019/5/23 14:38
 * @Version 1.0.0
 **/
@Component
@ConfigurationProperties(prefix = "elasticsearch")
public class ElasticSearchConfigration {
    private Map<String,Integer> host;

    public Map<String, Integer> getHost() {
        return host;
    }

    public void setHost(Map<String, Integer> host) {
        this.host = host;
    }
}
