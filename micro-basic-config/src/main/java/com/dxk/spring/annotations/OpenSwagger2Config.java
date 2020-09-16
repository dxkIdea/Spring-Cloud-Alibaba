package com.dxk.spring.annotations;

import com.dxk.spring.conditions.SwaggerConfigCondition;
import org.springframework.context.annotation.Conditional;

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
@Conditional(SwaggerConfigCondition.class)
public @interface OpenSwagger2Config {

    /**
     * 是否开启Swagger2配置，true-开启，false-关闭
     * @return
     */
    String openConfigStatus() default "1";
}
