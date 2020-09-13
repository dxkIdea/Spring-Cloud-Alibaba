package com.dxk.spring.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.dxk.spring.model.entity.CustomerInfo;
import com.dxk.spring.dao.CustomerInfoDao;
import com.dxk.spring.dto.ResponseDTO;
import com.dxk.spring.enums.Status;
import com.dxk.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: CustomerServiceImpl
 * @Description: 客户基本操作
 * @Date: 2020/9/10 20:32
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    @Autowired
    private CustomerInfoDao customerInfoDao;
    /**
     * @Author: dingxingkai
     * @Description: 新增客户
     * @Date: 2020/9/10 20:37
    **/
    @Override
    public ResponseDTO insertCustomer(CustomerInfo customerInfo) {
        redisTemplate.opsForValue().set("注册客户","customer");
        int insert = customerInfoDao.insert(customerInfo);
        if (insert > 0) {
            return ResponseDTO.SUCCESS(JSONObject.toJSON(customerInfo));
        }else {
            return ResponseDTO.FALL(Status.SERVERERROR.getCode(),"客户添加异常，请稍后重试！");
        }
    }

    /**
     * @Description: 客户登录
     * @param userName: 客户名称
     * @param passWord: 密码
     * @return: com.dxk.spring.dto.ResponseDTO
     * @date: 2020/9/12 22:51
     * @author: dingxingkai
     **/
    @Override
    public ResponseDTO customerLoginOn(String userName, String passWord) {
        CustomerInfo customerInfo = CustomerInfo.builder()
                .name(userName)
                .passWord(passWord)
                .build();
        return ResponseDTO.SUCCESS(JSONObject.toJSON(customerInfo));
    }
}
