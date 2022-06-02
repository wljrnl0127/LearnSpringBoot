package com.cfz.controller;

import com.cfz.service.AsynchronousTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 将返回值转换为json，@RestController = @Controller + @ResponseBody
public class AsynchronousController {

    @Autowired
    AsynchronousTaskService asynchronousTaskService;

    /**
     * 告诉springboot，这个方法是一个异步方法 异步方法不会阻塞主线程，可以异步执行 异步方法会自动注入一个异步任务管理器
     */
    @Async
    @RequestMapping("/hello")
    public String hello() {
        asynchronousTaskService.hello(); // 停止3秒，然后打印“数据正在处理中。。。”
        return "<h1>success</h1>";
    }

}
