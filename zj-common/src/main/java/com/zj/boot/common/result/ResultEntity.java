package com.zj.boot.common.result;

import lombok.Data;

/**
 * 返回结果实体类
 *
 * @author 郑军
 * @date 2021-11-07 23:01
 */
@Data
public class ResultEntity<T> {

    /**
     * 状态码
     */
    private String code;

    /**
     * 提示消息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;


    public ResultEntity() {
    }

    public ResultEntity(String code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    public ResultEntity(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
