package com.zj.boot.common;

import com.zj.boot.common.config.PropertiesConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 郑军
 * @date 2021-11-08 23:14
 */
@Configuration
@EnableConfigurationProperties(PropertiesConfig.class)
public class CommonAutoConfiguration {


}
