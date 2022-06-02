package com.cfz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 标识为控制器, 可以直接返回json数据, 不需要模板引擎, 不需要视图解析器, 不需要拦截器
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "<h1>Hello World</h1>";
    }

}