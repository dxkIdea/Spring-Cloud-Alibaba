package com.dxk.spring.service.Impl;

import com.dxk.spring.dto.EmailInfoDTO;
import com.dxk.spring.service.MimeMessageService;
import com.dxk.spring.vo.ResultVO;
import org.springframework.stereotype.Service;

/**
 * @ClassName: MimeMessageServiceImpl
 * @Description:
 * @Date: 2020/9/24 18:36
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Service
public class MimeMessageServiceImpl implements MimeMessageService {
    @Override
    public ResultVO sendMimeMessage(EmailInfoDTO emailInfoDTO) {
        return null;
    }
}
