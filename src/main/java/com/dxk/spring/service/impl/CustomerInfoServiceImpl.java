package com.dxk.spring.service.impl;

import com.dxk.spring.model.entity.CustomerInfo;
import com.dxk.spring.dao.CustomerInfoMapper;
import com.dxk.spring.service.CustomerInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dingxingkai
 * @since 2020-09-13
 */
@Service
public class CustomerInfoServiceImpl extends ServiceImpl<CustomerInfoMapper, CustomerInfo> implements CustomerInfoService {

}
