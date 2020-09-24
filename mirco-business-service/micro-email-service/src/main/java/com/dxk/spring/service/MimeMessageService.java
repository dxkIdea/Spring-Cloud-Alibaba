package com.dxk.spring.service;

import com.dxk.spring.dto.EmailInfoDTO;
import com.dxk.spring.vo.ResultVO;

/**
 * @ClassName: MimeMessgeService
 * @Description: 发送HTML格式、携带附件类型邮件
 * @Date: 2020/9/24 18:33
 * @Author: dingxingkai
 * @Version: 1.0
 */
public interface MimeMessageService {

    /**
     * 发送HTML格式邮件
     * @param emailInfoDTO
     * @return
     */
    ResultVO sendMimeMessage(EmailInfoDTO emailInfoDTO);
}
