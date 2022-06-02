package com.cfz;

import com.cfz.pojo.Dog;
import com.cfz.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ConfigApplicationTests {

    @Autowired // 注入对象,自动装配
    @Qualifier("dog") // 指定名称,可以不写,默认是类型,如果有多个,可以指定名称
    private Dog dog;

    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
