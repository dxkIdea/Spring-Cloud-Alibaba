package com.dxk.spring.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: RedisPorperties
 * @Description:
 * @Date: 2020/9/19 21:19
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Data
@ConfigurationProperties(prefix = "redis.config")
public class RedisProperties {
    /**
     * 是否初始化redis
     */
    private boolean enable = true;
}
