package com.dxk.spring.service.Impl;

import com.dxk.spring.service.CustomerService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: CustomerServiceImpl
 * @Description: 客户基本操作
 * @Date: 2020/9/10 20:32
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    /**
     * @Author: dingxingkai
     * @Description: 新增客户
     * @Date: 2020/9/10 20:37
    **/
    @Override
    public String insertCustomer(String userName, String passWord) {
        return "当前注册信息，客户名： " + userName + " 密码： " + passWord;
    }
}
