package com.dxk.spring.enums;

/**
 * @ClassName: Status
 * @Description: 状态值
 * @Date: 2020/9/12 22:25
 * @Author: dingxingkai
 * @Version: 1.0
 */
public enum Status {
    /**
     * 200
     */
    SUCCESS(200, "请求已成功"),
    /**
     * 302
     */
    REDIRECT(302, "跳转"),
    /**
     * 400
     */
    BADREQUEST(400, "请求参数有误"),
    /**
     * 403
     */
    FORBIDDEN(403, "拒绝服务"),
    /**
     * 404
     */
    NOTFOUND(404, "请求资源不存在"),
    /**
     * 500
     */
    SERVERERROR(500, "服务器不可预期错误");

    /**
     * 状态码
     */
    private int code;
    /**
     * 返回相信
     */
    private String message;

    Status(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
