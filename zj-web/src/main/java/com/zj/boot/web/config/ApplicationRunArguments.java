package com.zj.boot.web.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;

/**
 * @author 郑军
 * @date 2022-06-23 21:56
 */
@Slf4j
public class ApplicationRunArguments {

    /**
     * springboot项目启动的时候的参数信息
     */
    public ApplicationRunArguments(ApplicationArguments arguments) {
        if (log.isDebugEnabled()) {
            log.debug("启动参数：{}", arguments.getOptionNames());
        }
    }
}
