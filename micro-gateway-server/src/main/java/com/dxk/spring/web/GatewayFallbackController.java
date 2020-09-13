package com.dxk.spring.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: GatewayFallbackController
 * @Description: 服务降级，接口转发控制层
 * @Date: 2020/9/12 21:55
 * @Author: dingxingkai
 * @Version: 1.0
 */
@RestController
public class GatewayFallbackController {

    /**
     * @Description: 微服务网关服务降级重定向地址
     * @date: 2020/9/12 21:59
     * @author: dingxingkai
     **/
    @PostMapping(value = "/defaultfallback")
    public Map<String,Object> defaultFallback() {
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("msg","服务超时降级");
        map.put("data",null);
        return map;
    }

}
