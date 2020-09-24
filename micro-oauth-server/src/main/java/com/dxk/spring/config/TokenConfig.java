package com.dxk.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * @ClassName: TokenConfig
 * @Description:
 * @Date: 2020/9/24 11:04
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Configuration
public class TokenConfig {
    /**
     * 备注 资源服务和授权服务要采用同样的密钥
     */
    private String SIGNING_KEY = "oauth123";

    @Bean
    public TokenStore tokenStore() {
        //使用内存存储令牌（普通令牌）
        //return new InMemoryTokenStore();

        // JWT 令牌存储方案
        return new JwtTokenStore(accessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        //对称秘钥，资源服务器使用该秘钥来验证
        converter.setSigningKey(SIGNING_KEY);
        return converter;
    }
}
