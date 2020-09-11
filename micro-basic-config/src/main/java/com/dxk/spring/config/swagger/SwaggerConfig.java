package com.dxk.spring.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @ClassName: SwaggerConfig
 * @Description: Swagger配置类
 * @Date: 2020/9/11 15:18
 * @Author: dingxingkai
 * @Version: 1.0
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Resource
    private SwaggerInfo swaggerInfo;

    /**
     * 配置Swagger得 Docket bean实例
     * @return
     */
    @Bean
    @DependsOn(value = "SwaggerInfo")
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    /**
     * 配置swagger信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfo(
                swaggerInfo.getTitle(),
                swaggerInfo.getDescription(),
                swaggerInfo.getVersion(),
                swaggerInfo.getTermsOfServiceUrl(),
                // 作者信息
                new Contact(swaggerInfo.getName(), swaggerInfo.getUrl(), swaggerInfo.getEmail()),
                swaggerInfo.getLicense(),
                swaggerInfo.getLicenseUrl(),
                new ArrayList<VendorExtension>()
        );
    }

}
