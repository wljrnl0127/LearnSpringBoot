package com.cfz.controller;

import com.cfz.pojo.Department;
import com.cfz.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 加了 @Controller,就会走视图解析器,和@ResponseBody搭配使用
 * 加了 @RestController 注解的类下面的所有方法都只能返回 json 格式的数据
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /**
     * 获取所有部门信息
     */
    @RequestMapping("/departments")
    public String getDepartments(Model model) {
        List<Department> departments = departmentService.getBaseMapper().selectList(null);
        model.addAttribute("departments", departments);
        return "emp/list";
    }

}
