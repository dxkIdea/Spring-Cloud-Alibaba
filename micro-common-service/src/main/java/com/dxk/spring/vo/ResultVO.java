package com.dxk.spring.vo;

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
public class ResultVO{
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
    public static ResultVO success() {
        return ResultVO.builder()
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
    public static ResultVO success(Object resultData) {
        return ResultVO.builder()
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
    public static ResultVO fall(Integer status, String resultMsg) {
        return ResultVO.builder()
                .resultCode(status)
                .resultMsg(resultMsg)
                .build();
    }
}
