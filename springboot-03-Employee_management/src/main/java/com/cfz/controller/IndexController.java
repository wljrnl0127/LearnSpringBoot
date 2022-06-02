package com.cfz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //声明为控制器，可以被Spring扫描到，并且被Spring容器管理
public class IndexController {

    /**
     * 首页
     */
    @RequestMapping({"/", "/index.html"}) // 映射到/index.html，这样就可以直接访问到index.html，不用再写/index.html
    public String index() {
        return "index";
    }


}
