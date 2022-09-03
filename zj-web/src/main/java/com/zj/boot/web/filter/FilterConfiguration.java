package com.zj.boot.web.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Filter过滤器配置。
 * <p>
 * Servlet中的filter，可以使用${@link javax.servlet.annotation.WebFilter}替代配置类配置
 *
 * @author 郑军
 * @date 2022-07-27 21:34
 */
@Configuration
public class FilterConfiguration {


    @Bean
    public FilterRegistrationBean<TraceIdFilter> traceIdFilter() {

        FilterRegistrationBean<TraceIdFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new TraceIdFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);

        return registrationBean;

    }


}
