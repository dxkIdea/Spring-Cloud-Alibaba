package com.dxk.spring.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: BasicLoggerProperties
 * @Description: 日志配置属性类
 * @Date: 2020/9/19 17:50
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Data
@ConfigurationProperties(prefix = "logging.config")
public class BasicLoggerProperties {
    /**
     * 日志上传地址
     */
    private String logstashHost;

    /**
     * 是否开启controller层api调用的日志
     */
    private boolean enableLogForController = true;

    /**
     * 是否开启ELK日志收集
     */
    private Boolean enableElk = false;
}
