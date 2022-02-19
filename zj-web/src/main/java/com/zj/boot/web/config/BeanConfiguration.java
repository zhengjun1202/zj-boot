package com.zj.boot.web.config;

import com.zj.boot.common.exception.MissKeyAttributeException;
import com.zj.boot.web.repository.Cat;
import com.zj.boot.web.test.SoutName;
import com.zj.boot.web.test.SoutName1;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 郑军
 * @date 2021-10-31 22:05
 */
@Configuration
@EnableConfigurationProperties({Cat.class, PropertiesConfig.class})
public class BeanConfiguration {


    /**
     * springboot自定义异常解析器测试
     *
     * 测试缺少关键的属性的自定义处理器
     *
     * @param propertiesConfig 属性配置
     * @return SoutName实例bean
     */
    //@Bean
    public SoutName soutName(PropertiesConfig propertiesConfig) {
        String string = propertiesConfig.getString();
        if (string == null || string.length() <= 0) {
            throw new MissKeyAttributeException("缺少关键属性", "string", propertiesConfig);
        }
        return new SoutName();
    }

    @Bean
    public SoutName1 afterApplicationStared1() {
        return new SoutName1();
    }


    @Bean
    public SoutName afterApplicationStared() {
        return new SoutName();
    }



}
