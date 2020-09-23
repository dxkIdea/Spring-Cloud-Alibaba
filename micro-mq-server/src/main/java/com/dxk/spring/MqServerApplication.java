package com.dxk.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: MqServerApplication
 * @Description: 消息服务启动类
 * @Date: 2020/9/22 11:45
 * @Author: dingxingkai
 * @Version: 1.0
 */
@SpringBootApplication
public class MqServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MqServerApplication.class,args);
    }
}
