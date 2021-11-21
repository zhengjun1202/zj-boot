package com.zj.boot.web;

import com.zj.boot.common.config.PropertiesConfig;
import com.zj.boot.web.repository.Cat;
import com.zj.boot.web.repository.User;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 郑军
 * @date 2021-10-31 16:24
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);


        ConfigurableListableBeanFactory beanFactory = run.getBeanFactory();
        // 获取实体类定义的名称
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanFactory.getBean(beanDefinitionName).toString());
        }

        String[] catNames = beanFactory.getBeanNamesForType(Cat.class);
        for (String catName : catNames) {
            System.out.println(catName);
        }

        User user = beanFactory.getBean("user", User.class);
        System.out.println(user);

        PropertiesConfig propertiesConfig = beanFactory.getBean(PropertiesConfig.class);
        System.out.println(propertiesConfig);


        String[] applicationNames = beanFactory.getBeanNamesForType(Application.class);
        for (String applicationName : applicationNames) {
            System.out.println(beanFactory.getBean(applicationName).toString());
        }
    }

}
