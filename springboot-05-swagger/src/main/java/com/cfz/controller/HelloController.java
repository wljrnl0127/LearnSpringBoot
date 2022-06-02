package com.cfz.controller;

import com.cfz.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    @PostMapping("/hello")
    public String hello(@ApiParam("username") String username, @ApiParam("password") String password) {
        return "hello " + username + password;
    }

    // 只要接口中，返回值是User实体类，Swagger2会自动生成响应的json字符串
    @GetMapping("/user")
    public User user() {
        return new User();
    }

}
