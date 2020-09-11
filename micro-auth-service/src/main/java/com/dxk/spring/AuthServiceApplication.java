package com.dxk.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**

/**
 * @ClassName: AuthServiceApplication
 * @Description:
 * @Date: 2020/9/11 14:05
 * @Author: dingxingkai
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AuthServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class,args);
    }
}
