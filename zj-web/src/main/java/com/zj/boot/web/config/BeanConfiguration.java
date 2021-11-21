package com.zj.boot.web.config;

import com.zj.boot.web.repository.Cat;
import com.zj.boot.web.repository.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 郑军
 * @date 2021-10-31 22:05
 */
@Configuration
@EnableConfigurationProperties(Cat.class)
public class BeanConfiguration {

    @Bean
    //@ConditionalOnBean(Cat.class)
    public User user() {
        return new User();
    }



}
