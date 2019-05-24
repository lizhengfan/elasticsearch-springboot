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
 * @ClassName Swagger2Configuration
 * @Author lizhengfan
 * @Date 2019/5/24 14:46
 * @Version 1.0.0
 **/
@Configuration
@EnableSwagger2
public class Swagger2Configuration {
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
                .title("Elasticsearch微服务")
                .description("更多http://www.lovefinal.com/")
                .termsOfServiceUrl("//www.lovefinal.com/")
                .contact("lizhengfan")
                .version("1.0.0")
                .build();
    }
}
