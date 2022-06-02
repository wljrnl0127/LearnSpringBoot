package com.cfz;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.annotation.Resource;

@SpringBootTest
class Springboot06TaskApplicationTests {

    @Resource // @Resource注解，用于注入bean
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {
        // 测试邮件发送
        SimpleMailMessage message = new SimpleMailMessage();

        message.setSubject("测试邮件");
        message.setText("测试邮件内容：LOVE 🥰 ❤❤❤黄建妹❤❤❤        BY——陈凤振");

        message.setTo("3063398361@qq.com");
        message.setFrom("2350002076@qq.com");

        mailSender.send(message);
//        这样你就收到我的爱心邮件啦！！！❤❤🥰🥰🥰🥰🥰🥰🥰🥰🥰🥰🥰🥰🥰🥰🥰🥰🥰🥰🥰🥰🥰
    }

//    @Test
//    public void contextLoads2() throws MessagingException {
//        //邮件设置2：一个复杂的邮件
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
//
//        helper.setSubject("通知-明天来狂神这听课");
//        helper.setText("<b style='color:red'>今天 7:30来开会</b>", true);
//
//        //发送附件
//        helper.addAttachment("1.jpg", new File(""));
//        helper.addAttachment("2.jpg", new File(""));
//
//        helper.setTo("24736743@qq.com");
//        helper.setFrom("24736743@qq.com");
//
//        mailSender.send(mimeMessage);
//    }

}
