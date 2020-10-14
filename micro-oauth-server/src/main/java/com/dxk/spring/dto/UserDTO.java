package com.dxk.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: UserDTO
 * @Description: 用户信息
 * @Date: 2020/9/27 23:00
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Integer id;

    private String userName;

    private String password;

    private String role;
}
