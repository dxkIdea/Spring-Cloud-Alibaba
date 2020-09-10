package com.dxk.spring.web;

import com.dxk.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: CustomerController
 * @Description: 客户基本操作-控制曾
 * @Date: 2020/9/10 20:29
 * @Author: dingxingkai
 * @Version: 1.0
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * @Author: dingxingkai
     * @Description: 添加客户
     * @Date: 2020/9/10 20:39
    **/
    @PostMapping(value = "/insertOne")
    public String insertCustomer(@RequestParam(name = "userName") String userName,
                                 @RequestParam(name = "passWord") String passWord) {
        return customerService.insertCustomer(userName,passWord);
    }
}
