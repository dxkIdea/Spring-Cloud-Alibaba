package com.dxk.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: CustomerApplication
 * @Description: 客户服务启动类
 * @Date: 2020/9/10 20:14
 * @Author: dingxingkai
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class,args);
    }
}
