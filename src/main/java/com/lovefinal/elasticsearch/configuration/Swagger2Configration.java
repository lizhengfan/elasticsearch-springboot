package com.lovefinal.elasticsearch.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description TODO
 * @ClassName Swagger2Configration
 * @Author lizhengfan
 * @Date 2019/5/22 16:39
 * @Version 1.0.0
 **/

@Configuration
@EnableSwagger2
public class Swagger2Configration {
    @Bean
    public Docket createRestApi() {
                 return new Docket(DocumentationType.SWAGGER_2)
                         .apiInfo(apiInfo())
                         .select()
                         .apis(RequestHandlerSelectors.basePackage("com.lovefinal.elasticsearch"))
                         .paths(PathSelectors.any())
                         .build();
             }

     private ApiInfo apiInfo() {
                 return new ApiInfoBuilder()
                         .title("ElasticSearch微服务")
                         .description("ElasticSearch微服务")
                         .termsOfServiceUrl("http://www.lovefinal.com")
                         .contact("李正凡")
                         .version("1.0.1")
                         .build();
             }
 }
