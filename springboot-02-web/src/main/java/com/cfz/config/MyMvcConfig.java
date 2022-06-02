package com.cfz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 扩展SpringMVC的配置
 *
 * @Configuration：指明当前类是一个配置类，可以用来配置修改Spring的一些内容，如添加组件，修改配置文件等
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    /**
     * 视图跳转控制器
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hjm").setViewName("test");
    }

}