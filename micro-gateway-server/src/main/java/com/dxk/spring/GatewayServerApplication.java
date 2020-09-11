package com.dxk.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: GatewayServerApplication
 * @Description: 微服务网关启动类
 * @Date: 2020/9/11 10:39
 * @Author: dingxingkai
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayServerApplication.class,args);
    }
}
