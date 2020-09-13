package com.dxk.spring.dto;

import com.dxk.spring.enums.Status;
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
public class ResponseDTO{
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
    private Object resultData;

    /**
     * @Description: 成功
     * @return: com.dxk.spring.dto.ResponseDTO
     * @date: 2020/9/12 22:32
     * @author: dingxingkai
     **/
    public static ResponseDTO SUCCESS() {
        return ResponseDTO.builder()
                .resultCode(Status.SUCCESS.getCode())
                .resultMsg(Status.SUCCESS.getMessage())
                .build();
    }

    /**
     * @Description: 成功
     * @param resultData: 返回信息
     * @return: com.dxk.spring.dto.ResponseDTO
     * @date: 2020/9/12 22:32
     * @author: dingxingkai
     **/
    public static ResponseDTO SUCCESS(Object resultData) {
        return ResponseDTO.builder()
                .resultCode(Status.SUCCESS.getCode())
                .resultMsg(Status.SUCCESS.getMessage())
                .resultData(resultData)
                .build();
    }

    /**
     * @Description: 异常返回
     * @param status: 异常状态码
     * @param resultMsg: 异常信息
     * @return: com.dxk.spring.dto.ResponseDTO
     * @date: 2020/9/12 22:35
     * @author: dingxingkai
     **/
    public static ResponseDTO FALL(Integer status, String resultMsg) {
        return ResponseDTO.builder()
                .resultCode(status)
                .resultMsg(resultMsg)
                .build();
    }

    /**
     * @Description: 异常返回
     * @param status: 异常状态码
     * @param resultMsg: 异常信息
     * @param resultData: 异常返回内容
     * @return: com.dxk.spring.dto.ResponseDTO
     * @date: 2020/9/12 22:35
     * @author: dingxingkai
     **/
    public static ResponseDTO FALL(Integer status, String resultMsg, Object resultData) {
        return ResponseDTO.builder()
                .resultCode(status)
                .resultMsg(resultMsg)
                .resultData(resultData)
                .build();
    }
}
