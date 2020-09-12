package com.dxk.spring.web;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: EmailController
 * @Description: 发送邮件控制层
 * @Date: 2020/9/12 15:32
 * @Author: dingxingkai
 * @Version: 1.0
 */
@RestController
public class SendEmailController {

    @Resource
    private JavaMailSender javaMailSender;

    @PostMapping(value = "/sendSimpleMsg")
    public void sendMailSimpleEmail() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("979352276@qq.com");
        simpleMailMessage.setTo("17600299358@163.com");
        simpleMailMessage.setSubject("测试");
        simpleMailMessage.setText("测试邮件");
        javaMailSender.send(simpleMailMessage);
    }

}
