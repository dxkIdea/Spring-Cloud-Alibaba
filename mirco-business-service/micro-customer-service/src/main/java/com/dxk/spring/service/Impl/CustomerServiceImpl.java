package com.dxk.spring.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.dxk.spring.dao.CustomerInfoDao;
import com.dxk.spring.enums.Status;
import com.dxk.spring.model.entity.CustomerInfo;
import com.dxk.spring.service.CustomerService;
import com.dxk.spring.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @ClassName: CustomerServiceImpl
 * @Description: 客户基本操作
 * @Date: 2020/9/10 20:32
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Service
@Slf4j
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
    public ResultVO insertCustomer(CustomerInfo customerInfo) {
        int insert = customerInfoDao.insert(customerInfo);
        if (insert > 0) {
            return ResultVO.success(JSONObject.toJSON(customerInfo));
        }else {
            return ResultVO.fall(Status.SERVERERROR.getCode(),"客户添加异常，请稍后重试！");
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
    public ResultVO customerLoginOn(String userName, String passWord) {
        Optional<CustomerInfo> customerInfo = Optional.ofNullable(customerInfoDao.selectByName(userName));
        customerInfo.ifPresent(c -> {
            boolean result = c.getPassword().equals(passWord);
            if (result) {
                log.info("查询出客户信息详情为：{}", JSONObject.toJSONString(customerInfo.get()));
            }else {
               log.info("密码验证失败");
            }
        });
        return null;
    }
}
