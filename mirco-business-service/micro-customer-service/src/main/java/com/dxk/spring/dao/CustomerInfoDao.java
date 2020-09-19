package com.dxk.spring.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dxk.spring.model.entity.CustomerInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: CustomerInfoDao
 * @Description: 客户持久层
 * @Date: 2020/9/13 19:29
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Mapper
public interface CustomerInfoDao extends BaseMapper<CustomerInfo> {
    /**
     * 通过客户名称查到客户详细信息
     * @param name
     * @return
     */
    CustomerInfo selectByName(String name);
}
