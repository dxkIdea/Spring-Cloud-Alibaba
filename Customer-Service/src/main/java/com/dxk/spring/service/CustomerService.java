package com.dxk.spring.service;

/**
 * @ClassName: CustomerService
 * @Description: 客户基本操作接口
 * @Date: 2020/9/10 20:30
 * @Author: dingxingkai
 * @Version: 1.0
 */
public interface CustomerService {

    /**
     * @Author: dingxingkai
     * @Description: 添加客户
     * @Date: 2020/9/10 20:31
    **/
    String insertCustomer(String userName, String passWord);
}
