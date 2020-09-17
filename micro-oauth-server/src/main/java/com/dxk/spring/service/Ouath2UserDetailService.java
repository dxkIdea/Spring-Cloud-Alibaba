package com.dxk.spring.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @ClassName: Ouath2UserDetailService
 * @Description:
 * @Date: 2020/9/17 12:09
 * @Author: dingxingkai
 * @Version: 1.0
 */
public class Ouath2UserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
