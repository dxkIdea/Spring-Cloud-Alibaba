package com.dxk.spring.annotations;

import java.lang.annotation.*;

/**
 * @ClassName: OpenSwagger2Config
 * @Description: 是否开启Swagger2配置功能
 * @Date: 2020/9/12 10:35
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface OpenSwagger2Config {

    /**
     * 是否开启Swagger2配置，true-开启，false-关闭
     * @return
     */
    boolean openConfigStatus() default true;
}
