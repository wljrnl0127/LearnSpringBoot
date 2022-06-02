package com.cfz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

// 在templates目录下的所有页面，只能通过controller来跳转！！！
@Controller   // 标识为控制器,spring会扫描该类,并且创建该类的实例,并注入到spring容器中,以便使用,该类的方法可以被访问,并且被springmvc调用
public class IndexController {

    /**
     * 请求路径，可以是任意的字符串，只要和方法名不一样即可，如果不写，默认为方法名，如果写了，那么就是请求路径，如果请求路径和方法名一样，那么就不需要写
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/a")
    public String a() {
        return "a";
    }

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("msg", "<h1>hello springboot</h1>");

        model.addAttribute("users", Arrays.asList("hjm", "love", "cfz"));
        return "test";
    }

}
