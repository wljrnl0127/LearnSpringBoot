package com.cfz.HelloSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序的入口类,继承 SpringBootApplication, 并且指定 SpringBoot 的启动类
 *
 * @SpringBootApplication : 指定 SpringBoot 的启动类, 说明这个类是SpringBoot的主配置类, 并且自动配置了一些基本的 SpringBoot 的配置
 */
@SpringBootApplication
public class HelloSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootApplication.class, args);
    }

}