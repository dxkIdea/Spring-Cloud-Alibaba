package com.dxk.spring.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: SwaggerProperties
 * @Description: SwaggerDoc 配置属性类
 * @Date: 2020/9/19 16:34
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Data
@ConfigurationProperties(prefix = "swagger.config")
public class SwaggerProperties {
    /**
     * 是否配置Swagger，默认开启
     */
    private Boolean enable = true;

    /**
     * 接口扫描路径，如Controller路径
     */
    private String basePackage;

    /**
     * 文档标题
     */
    private String title;

    /**
     * 文档描述
     */
    private String description;

    /**
     * 文档描述颜色
     */
    private String descriptionColor = "#42b983";

    /**
     * 文档描述字体大小
     */
    private String descriptionFontSize = "14";

    /**
     * 文档版本
     */
    private String version;

    /**
     * 服务地址
     */
    private String termsOfServiceUrl;

    /**
     * 个人信息-姓名
     */
    private String name;

    /**
     * 个人信息-个人博客等地址
     */
    private String url;

    /**
     * 人信息-个人邮箱
     */
    private String email;

    /**
     * 协议、许可
     */
    private String license;

    /**
     * 协议、许可地址
     */
    private String licenseUrl;
}
