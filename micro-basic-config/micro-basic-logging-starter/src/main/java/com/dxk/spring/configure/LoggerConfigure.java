package com.dxk.spring.configure;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import com.dxk.spring.aspect.ControllerLogAspect;
import com.dxk.spring.properties.BasicLoggerProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import net.logstash.logback.appender.LogstashTcpSocketAppender;
import net.logstash.logback.encoder.LogstashEncoder;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * @ClassName: LoggerConfigure
 * @Description: 日志装配类
 * @Date: 2020/9/19 17:52
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Data
@Configuration
@EnableConfigurationProperties(value = BasicLoggerProperties.class)
public class LoggerConfigure {
    /**
     * 日志属性
     */
    private final BasicLoggerProperties properties;

    private static final LoggerContext CONTEXT;
    private static final Logger ROOTLOGGER;

    /**
     * 应用名称
     */
    @Value("${spring.application.name}")
    private String applicationName;

    static {
        CONTEXT = (LoggerContext) LoggerFactory.getILoggerFactory();
        ROOTLOGGER = CONTEXT.getLogger("ROOT");
    }

    @ConditionalOnProperty(name = "log.config.enable-log-for-controller", havingValue = "true")
    @Bean
    public ControllerLogAspect controllerLogAspect(){
        return new ControllerLogAspect();
    }

    @ConditionalOnProperty(name = "log.config.enable-elk", havingValue = "true")
    @Bean
    public void enableElk() throws JsonProcessingException {
        LogstashTcpSocketAppender appender = new LogstashTcpSocketAppender();
        LogstashEncoder encoder = new LogstashEncoder();

        HashMap<String, String> customFields = new HashMap<>(2);
        customFields.put("application-name", applicationName);
        String customFieldsString = new ObjectMapper().writeValueAsString(customFields);
        encoder.setCustomFields(customFieldsString);

        appender.setEncoder(encoder);
        appender.addDestination(properties.getLogstashHost());
        appender.setName("logstash[" + applicationName + "]");
        appender.start();
        appender.setContext(CONTEXT);
        ROOTLOGGER.addAppender(appender);
    }
}
