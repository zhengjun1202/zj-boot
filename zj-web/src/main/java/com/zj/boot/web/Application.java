package com.zj.boot.web;

import com.zj.boot.web.config.PropertiesConfig;
import com.zj.boot.web.repository.Cat;
import com.zj.boot.web.repository.User;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 郑军
 * @date 2021-10-31 16:24
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 直接通过SpringApplication的静态run方法启动
        //ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

        // 通过new SpringApplication的方式启动
        //SpringApplication springApplication = new SpringApplication(Application.class);
        //ConfigurableApplicationContext run = springApplication.run(args);

        // 通过SpringApplicationBuilder的方式构建
        ConfigurableApplicationContext run = new SpringApplicationBuilder().sources(Application.class).run(args);



        /*ConfigurableListableBeanFactory beanFactory = run.getBeanFactory();
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
        System.out.println(propertiesConfig);*/

    }

}
