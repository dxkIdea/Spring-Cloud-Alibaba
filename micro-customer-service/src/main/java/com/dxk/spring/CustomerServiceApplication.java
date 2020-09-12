package com.dxk.spring;

import com.dxk.spring.annotations.OpenSwagger2Config;
import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan("com.dxk.spring.dao")
@OpenSwagger2Config(openConfigStatus = false)
public class CustomerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class,args);
    }
}
