package com.cfz.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity //开启SpringSecurity, 启动安全框架
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // 授权
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 定制请求的授权规则
        // 首页所有人可以访问
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3");

        // 没有权限默认跳转到登陆页面
        http.formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .loginPage("/toLogin")
                .loginProcessingUrl("/login"); // 登陆表单提交请求

        http.csrf().disable();//关闭csrf功能:跨站请求伪造,默认只能通过post方式提交logout请求

        // 开启注销功能，并跳转到登陆页面
        http.logout().logoutSuccessUrl("/");

        //开启记住我功能，并设置过期时间，默认2周，自定义接收前端参数
        http.rememberMe().rememberMeParameter("remember");
    }

    // 认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 定义认证的策略(没有数据库, 我们就用内存的数据)
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("hjm").password(new BCryptPasswordEncoder().encode("0920")).roles("vip1")
                .and()
                .withUser("hjm2").password(new BCryptPasswordEncoder().encode("0920")).roles("vip1", "vip2")
                .and()
                .withUser("admin").password(new BCryptPasswordEncoder().encode("0920")).roles("vip1", "vip2", "vip3");
    }

}
