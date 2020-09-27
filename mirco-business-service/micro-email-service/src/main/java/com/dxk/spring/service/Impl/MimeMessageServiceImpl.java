package com.dxk.spring.service.Impl;

import com.dxk.spring.dto.EmailInfoDTO;
import com.dxk.spring.service.MimeMessageService;
import com.dxk.spring.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.util.Date;

/**
 * @ClassName: MimeMessageServiceImpl
 * @Description:
 * @Date: 2020/9/24 18:36
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Service
public class MimeMessageServiceImpl implements MimeMessageService {
    @Autowired
    private JavaMailSender javaMailSender;

    /**
     * @Description: 较复杂邮件
     * @param emailInfoDTO:
     * @return: com.dxk.spring.vo.ResultVO
     * @date: 2020/9/25 11:39
     * @author: dingxingkai
     **/
    @Override
    public ResultVO sendMimeMessage(EmailInfoDTO emailInfoDTO) {
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(javaMailSender.createMimeMessage(),true);
            mimeMessageHelper.setFrom(emailInfoDTO.getFrom());
            mimeMessageHelper.setTo(emailInfoDTO.getTo());
            mimeMessageHelper.setSentDate(new Date());
            mimeMessageHelper.setSubject(emailInfoDTO.getSubject());
            mimeMessageHelper.setText(emailInfoDTO.getText());
            javaMailSender.send(mimeMessageHelper.getMimeMessage());
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
