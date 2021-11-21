package com.zj.boot.common.result;

/**
 * 返回的结果编码
 *
 * @author 郑军
 * @date 2021-11-14 21:31
 */
public enum ResultEnum {
    /**
     * 成功处理
     * <br/>
     * code: 200
     * <br/>
     * message: 成功
     */
    SUCCESS("200", "成功");

    ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 响应状态码
     */
    private final String code;

    /**
     * 错误消息提示
     */
    private final String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
