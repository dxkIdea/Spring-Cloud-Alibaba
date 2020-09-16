package com.dxk.spring.web;

import com.dxk.spring.model.entity.CustomerInfo;
import com.dxk.spring.vo.ResultVO;
import com.dxk.spring.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    /**
     * @Author: dingxingkai
     * @Description: 添加客户
     * @Date: 2020/9/10 20:39
    **/
    @PostMapping(value = "/insertOne")
    @ApiOperation(value = "添加新客户", tags = "客户注册",httpMethod = "POST")
    public ResultVO insertCustomer(@RequestBody CustomerInfo customerInfo) {
        return customerService.insertCustomer(customerInfo);
    }

    /**
     * @Author: dingxingkai
     * @Description: 客户登录
     * @Date: 2020/9/10 20:39
     **/
    @PostMapping(value = "/login")
    @ApiOperation(value = "客户登录接口", tags = "客户登录接口",httpMethod = "POST")
    public ResultVO customerLogin(@RequestParam(name = "name") String userName,
                                  @RequestParam(name = "password") String passWord) {
        return customerService.customerLoginOn(userName,passWord);
    }
}
