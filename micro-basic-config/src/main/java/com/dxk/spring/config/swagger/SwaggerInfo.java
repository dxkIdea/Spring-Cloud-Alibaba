package com.dxk.spring.config.swagger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: SwaggerInfo
 * @Description:
 * @Date: 2020/9/11 15:22
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Configuration
public class SwaggerInfo {
    /**
     * 标题
     */
    @Value(value = "${swagger2.apiInfo.title}")
    private String title;

    /**
     * 描述
     */
    @Value(value = "${swagger2.apiInfo.description}")
    private String description;

    /**
     * 版本
     */
    @Value(value = "${swagger2.apiInfo.version}")
    private String version;

    /**
     * 服务地址
     */
    @Value(value = "${swagger2.apiInfo.termsOfServiceUrl}")
    private String termsOfServiceUrl;

    /**
     * 个人信息-姓名
     */
    @Value(value = "${swagger2.apiInfo.name}")
    private String name;

    /**
     * 个人信息-个人博客等地址
     */
    @Value(value = "${swagger2.apiInfo.url}")
    private String url;

    /**
     * 人信息-个人邮箱
     */
    @Value(value = "${swagger2.apiInfo.email}")
    private String email;

    /**
     * 许可
     */
    @Value(value = "${swagger2.apiInfo.license}")
    private String license;

    /**
     * 许可地址
     */
    @Value(value = "${swagger2.apiInfo.licenseUrl}")
    private String licenseUrl;

    /**
     * @Description: 将配置文件中定义的swagger信息封装至swaggerInfo中，容器管理
     * @return: com.dxk.spring.config.swagger.SwaggerInfo
     * @date: 2020/9/11 15:34
     * @author: dingxingkai
     **/
    @Bean(name = "SwaggerInfo")
    public SwaggerInfo instanceSwaggerInfo() {
        SwaggerInfo swaggerInfo = SwaggerInfo.builder()
                .title(this.title)
                .description(this.description)
                .version(this.version)
                .termsOfServiceUrl(this.termsOfServiceUrl)
                .name(this.name)
                .url(this.url)
                .email(this.email)
                .license(this.license)
                .licenseUrl(this.licenseUrl).build();
        return swaggerInfo;
    }

}
