package com.dxk.spring.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: Swagger2ConfigProperties
 * @Description: 控制是否开启Swagger2自动配置属性类
 * @Date: 2020/9/12 15:15
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Data
@ConfigurationProperties(prefix = "config.swagger2")
public class Swagger2ConfigProperties {
    /**
     * 默认为true
     */
    private Boolean enable = Boolean.TRUE;
}
