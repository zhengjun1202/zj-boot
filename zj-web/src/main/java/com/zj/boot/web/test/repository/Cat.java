package com.zj.boot.web.test.repository;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @author 郑军
 * @date 2021-10-31 22:47
 */
@Data
@ConfigurationProperties(prefix = "cat")
@Validated
public class Cat {

    /**
     * 猫的名称，默认为jerry
     */
    private String name = "jerry";

    @NotNull
    private String address;
}
