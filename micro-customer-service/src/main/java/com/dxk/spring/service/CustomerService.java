package com.dxk.spring.service;

import com.dxk.spring.model.entity.CustomerInfo;
import com.dxk.spring.vo.ResultVO;

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
    ResultVO insertCustomer(CustomerInfo customerInfo);

    /**
     * @Description: 客户登录接口
     * @date: 2020/9/12 22:51
     * @author: dingxingkai
     **/
    ResultVO customerLoginOn(String userName, String passWord);

}
