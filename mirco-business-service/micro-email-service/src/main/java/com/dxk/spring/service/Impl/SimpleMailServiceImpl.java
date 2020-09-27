package com.dxk.spring.service.Impl;

import com.dxk.spring.dto.EmailInfoDTO;
import com.dxk.spring.service.SimpleMailService;
import com.dxk.spring.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: SimpleMailServiceImpl
 * @Description: 普通邮件接口实现类
 * @Date: 2020/9/24 16:46
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Service
@Slf4j
public class SimpleMailServiceImpl implements SimpleMailService {
    @Resource
    private JavaMailSender javaMailSender;

    /**
     * @Description: 发送普通邮件
     * @param emailInfoDTO: 邮件详细信息
     * @return: void
     * @date: 2020/9/24 17:02
     * @author: dingxingkai
     **/
    @Override
    public ResultVO sendSimpleEmail(EmailInfoDTO emailInfoDTO) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        try {
            BeanUtils.copyProperties(emailInfoDTO, simpleMailMessage);
            log.info("发送普通邮件，详情： {}", simpleMailMessage.toString());
            javaMailSender.send(simpleMailMessage);
        } catch (Exception ex) {
            log.error("发送普通邮件异常：{}", ex.getMessage());
        }
        return ResultVO.success();
    }
}
