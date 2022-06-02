package com.cfz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // 标识为spring组件, 可以被spring管理, 自动注入
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dog {

    @Value("小黄")
    private String name;
    @Value("18")
    private Integer age;

}
