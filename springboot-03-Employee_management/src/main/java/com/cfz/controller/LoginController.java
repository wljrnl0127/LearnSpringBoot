package com.cfz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    /**
     * 登录页面
     */
    @RequestMapping("/user/login") // 访问路径
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
        // 判断用户名和密码是否正确
        if (username != "" && "1".equals(password)) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html"; // 重定向到主页
        } else {
            model.addAttribute("msg", "用户名或密码错误！");
            return "index"; // 返回登录页面
        }
    }

    /**
     * 注销
     */
    @RequestMapping("/user/loginout")
    public String logout(HttpSession session) {
        session.invalidate(); // 清除session
        return "redirect:/index.html";
    }
}
