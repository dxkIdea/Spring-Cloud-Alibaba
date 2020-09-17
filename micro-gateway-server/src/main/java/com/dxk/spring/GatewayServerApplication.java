package com.dxk.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName: GatewayServerApplication
 * @Description: 微服务网关启动类
 * @Date: 2020/9/11 10:39
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServerApplication {
    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(GatewayServerApplication.class, args);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();
        log.info("当前应用运行环境信息：ip ------------> {}" ,InetAddress.getLocalHost().getHostAddress());
        log.info("当前应用运行环境信息：port ----------> {}" ,environment.getProperty("server.port"));
        log.info("当前应用运行环境信息：ap-name -------> {}" ,environment.getProperty("spring.application.name"));
    }
}
