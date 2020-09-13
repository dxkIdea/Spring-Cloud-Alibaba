package com.dxk.spring.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @ClassName: User
 * @Description:
 * @Date: 2020/9/11 23:48
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerInfo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 客户名称
     */
    @NotBlank(message = "客户名称不可为空")
    private String name;

    /**
     * 密码
     */
    @NotBlank(message = "密码不可为空")
    private String passWord;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 邮箱
     */
    private String email;
}
