package com.dxk.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: ResponseDTO
 * @Description:
 * @Date: 2020/9/11 18:53
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDTO <T>{
    /**
     * 响应编码
     */
    private Integer resultCode;
    /**
     * 响应描述
     */
    private String resultMsg;
    /**
     * 响应信息
     */
    private T resultData;
}
