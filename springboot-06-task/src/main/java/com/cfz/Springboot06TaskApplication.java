package com.cfz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync // 开启异步任务, 否则@Async注解无效, 可以在@EnableAsync的属性中指定线程池大小, 如@EnableAsync(mode = "async", poolSize = 10)
@EnableScheduling // 开启定时任务
@SpringBootApplication
public class Springboot06TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot06TaskApplication.class, args);
    }

}
