package com.dxk.spring.job.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @ClassName: TestHandler
 * @Description: 测试定时任务
 * @Date: 2020/9/27 23:35
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Component
public class TestHandler {

    @XxlJob("test")
    public ReturnT<String> test(String param) {
        System.out.println("success");
        return ReturnT.SUCCESS;
    }
}
