package com.dxk.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: EmailServiceApplication
 * @Description: 邮件微服务
 * @Date: 2020/9/12 15:30
 * @Author: dingxingkai
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EmailServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmailServiceApplication.class,args);
    }
}
