package com.dxk.spring.web;

import com.dxk.spring.dto.EmailInfoDTO;
import com.dxk.spring.service.SimpleMailService;
import com.dxk.spring.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: EmailController
 * @Description: 发送邮件控制层
 * @Date: 2020/9/12 15:32
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Api(tags = "发送邮件服务")
@RestController
public class SendEmailController {
    @Autowired
    private SimpleMailService simpleMailService;

    /**
     * @Description: 发送普通邮件
     * @param mailInfo: 邮件详细信息
     * @return: com.dxk.spring.vo.ResultVO
     * @date: 2020/9/24 17:46
     * @author: dingxingkai
     **/
    @PostMapping(value = "/sendSimpleMsg")
    @ApiOperation(value = "普通邮件发送")
    public ResultVO sendMailSimpleEmail(@RequestBody EmailInfoDTO mailInfo) {
        return simpleMailService.sendSimpleEmail(mailInfo);
    }

}
