package com.cfz.HelloSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 标识为控制器,控制器会被spring管理,spring会自动注入,并提供依赖注入
@RequestMapping("/hello") // 指定请求的映射路径
public class HelloController {

    /**
     * 这就是接口，这个接口的作用是返回一个字符串
     * 接口：http://localhost:8080/hello
     */
    @GetMapping("/hello") // 指定请求的方法
    @ResponseBody // 返回值为字符串，不需要视图解析器解析，直接返回
    public String hello() {
        return "hello spring boot";
    }

}