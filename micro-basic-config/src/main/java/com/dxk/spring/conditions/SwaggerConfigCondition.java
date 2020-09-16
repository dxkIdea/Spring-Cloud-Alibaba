package com.dxk.spring.conditions;

import com.dxk.spring.annotations.OpenSwagger2Config;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Objects;

/**
 * @ClassName: SwaggerConfigCondition
 * @Description:
 * @Date: 2020/9/16 22:17
 * @Author: dingxingkai
 * @Version: 1.0
 */
public class SwaggerConfigCondition implements Condition {
    /**
     * 配置化启动值 1-启动配置化
     */
    private static final String status = "1";

    /**
     * @Description: 匹配验证
     * @date: 2020/9/16 22:28
     * @author: dingxingkai
     **/
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        MultiValueMap<String, Object> allAnnotationAttributes = metadata.getAllAnnotationAttributes(OpenSwagger2Config.class.getName());
        List<Object> openConfigStatus = allAnnotationAttributes.get("openConfigStatus");
        return Objects.nonNull(openConfigStatus) && openConfigStatus.size() > 0 && openConfigStatus.get(0).toString().equals(status);
    }
}
