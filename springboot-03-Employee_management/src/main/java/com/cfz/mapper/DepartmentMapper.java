package com.cfz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cfz.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 声明这是一个Mapper, 以便Mybatis可以找到该类, 并进行加载, 并且可以使用该类的方法, 如果不声明, Mybatis将无法找到该类, 并且无法加载该类的方法, 因此无法使用该类的方法
 * Mapper 继承该接口后，无需编写 mapper.xml 文件，即可获得CRUD功能
 */
@Mapper
@Repository
public interface DepartmentMapper extends BaseMapper<Department> {
}
