package com.dxk.spring.web;

import com.dxk.spring.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: CustomerController
 * @Description: 客户基本操作-控制曾
 * @Date: 2020/9/10 20:29
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Api(tags = "客户基本操作",value = "客户基本操作-CURD")
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    /**
     * @Author: dingxingkai
     * @Description: 添加客户
     * @Date: 2020/9/10 20:39
    **/
    @PostMapping(value = "/insertOne")
    @ApiOperation(value = "添加新客户", tags = "客户注册",httpMethod = "POST")
    public String insertCustomer(@RequestParam(name = "userName") String userName,
                                 @RequestParam(name = "passWord") String passWord) {
        redisTemplate.opsForValue().set("name","dxk");
        return customerService.insertCustomer(userName,passWord);
    }
}
