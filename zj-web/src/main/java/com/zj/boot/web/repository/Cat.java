package com.zj.boot.web.repository;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 郑军
 * @date 2021-10-31 22:47
 */
@Data
@ConfigurationProperties(prefix = "cat")
public class Cat {

    /**
     * 猫的名称，默认为jerry
     */
    private String name = "jerry";
}
