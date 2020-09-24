package com.dxk.spring.dto;

import com.sun.istack.internal.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName: EmailInfoDTO
 * @Description: 须发送邮件信息载体
 * @Date: 2020/9/24 16:55
 * @Author: dingxingkai
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailInfoDTO {
    /**
     * 发送者
     */
    @Nullable
    private String from;

    /**
     * 发送回复的地址
     */
    @Nullable
    private String replyTo;

    /**
     * 接受者
     */
    @Nullable
    private String[] to;

    /**
     * 抄送
     */
    @Nullable
    private String[] cc;

    /**
     * 密送
     */
    @Nullable
    private String[] bcc;

    /**
     * 发送日期
     */
    @Nullable
    private Date sentDate;

    /**
     * 邮件主题
     */
    @Nullable
    private String subject;

    /**
     * 邮件内容
     */
    @Nullable
    private String text;
}
