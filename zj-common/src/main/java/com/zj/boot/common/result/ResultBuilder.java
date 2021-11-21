package com.zj.boot.common.result;

/**
 * 返回对象构造器
 *
 * @author 郑军
 * @date 2021-11-15 22:14
 */
public class ResultBuilder {
    /**
     * 返回成功
     *
     * @return ResultEntity<String>
     */
    public static ResultEntity<String> success() {
        return create(ResultEnum.SUCCESS, "");
    }

    /**
     * 返回结果为空
     * @param resultEnum 结果编码
     * @return ResultEntity<Object>
     */
    public static ResultEntity<Object> create(ResultEnum resultEnum) {
        return new ResultEntity<>(resultEnum.getCode(), resultEnum.getMessage(), null);
    }

    /**
     * 返回结果加状态码信息
     * @param resultEnum 结果编码
     * @param data 返回数据
     * @param <T> 数据类型
     * @return ResultEntity<T>
     */
    public static <T> ResultEntity<T> create(ResultEnum resultEnum, T data) {
        return new ResultEntity<>(resultEnum.getCode(), resultEnum.getMessage(), data);
    }

    /**
     * 返回结果加状态码信息
     * @param code 状态码
     * @param message 结果信息
     * @param data 结果数据
     * @param <T> 结果类型
     * @return ResultEntity<T>
     */
    public static <T> ResultEntity<T> create(String code, String message, T data) {
        return new ResultEntity<>(code, message, data);
    }

}
