package com.cfz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 扫描mapper文件
 */
@MapperScan("com.cfz.mapper")
@SpringBootApplication
public class Springboot03EmployeeManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03EmployeeManagementApplication.class, args);
    }

}
