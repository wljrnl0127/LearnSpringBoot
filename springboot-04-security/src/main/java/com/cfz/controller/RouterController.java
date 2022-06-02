package com.cfz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// 在templates目录下的所有页面，只能通过controller来跳转！！！
@Controller  // 标识为控制器,spring会扫描该类,并且创建该类的实例,并注入到spring容器中,以便使用,该类的方法可以被访问,并且被springmvc调用
public class RouterController {

    @RequestMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "views/login";
    }

    @RequestMapping("/level1/{page}")
    public String level1(@PathVariable("page") int page) {
        return "views/level1/" + page;
    }

    @RequestMapping("/level2/{page}")
    public String level2(@PathVariable("page") int page) {
        return "views/level2/" + page;
    }

    @RequestMapping("/level3/{page}")
    public String level3(@PathVariable("page") int page) {
        return "views/level3/" + page;
    }

}
