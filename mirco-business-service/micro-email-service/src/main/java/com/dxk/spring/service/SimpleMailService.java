package com.dxk.spring.service;

import com.dxk.spring.dto.EmailInfoDTO;
import com.dxk.spring.vo.ResultVO;

/**
 * @ClassName: SimpleMailService
 * @Description: 普通邮件接口
 * @Date: 2020/9/24 16:43
 * @Author: dingxingkai
 * @Version: 1.0
 */
public interface SimpleMailService {
    /**
     * 发送普通邮件
     */
    ResultVO sendSimpleEmail(EmailInfoDTO emailInfoDTO);
}
