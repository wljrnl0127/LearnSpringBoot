package com.cfz.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 员工表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("employee") // 实体类的注解,用于指定实体类的名称,用于在配置文件中指定实体类的名称,如果不指定,则默认为类名称
public class Employee {

    /**
     * 主键
     *
     * @TableId中可以决定主键的类型,不写会采取默认值,默认值可以在yml中配置 AUTO: 数据库ID自增
     * INPUT: 用户输入ID
     * ID_WORKER: 全局唯一ID，Long类型的主键
     * ID_WORKER_STR: 字符串全局唯一ID
     * UUID: 全局唯一ID，UUID类型的主键
     * NONE: 该类型为未设置主键类型
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    /**
     * 0女 1男
     */
    private Integer gender;
//    private Department department;
    private String telephone;
    private double salary;
    private String coverImage;
    private Date createdAt;
    private Date updatedAt;

}
