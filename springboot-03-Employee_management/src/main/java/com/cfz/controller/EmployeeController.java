package com.cfz.controller;

import com.cfz.pojo.Department;
import com.cfz.pojo.Employee;
import com.cfz.service.DepartmentService;
import com.cfz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 加了 @Controller,就会走视图解析器,和@ResponseBody搭配使用
 * 加了 @RestController 注解的类下面的所有方法都只能返回 json 格式的数据
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    /**
     * 获取员工列表
     */
    @RequestMapping("/employees")
    public String getEmployees(Model model) {
        List<Employee> employees = employeeService.getBaseMapper().selectList(null);
        model.addAttribute("employees", employees);
        return "emp/list";
    }

    /**
     * 跳转到添加页面
     */
    @RequestMapping("/toAddEmp")
    public String toAddEmp(Model model) {
//        查出所有的部门
        List<Department> departments = departmentService.getBaseMapper().selectList(null);
        model.addAttribute("departments", departments);
        return "emp/add";
    }

    /**
     * 添加员工
     */
    @PostMapping("/addEmp")
    public String addEmp(Employee employee) {
        System.out.println(employee);
        employeeService.getBaseMapper().insert(employee);
        return "redirect:/employees";
    }

    /**
     * 删除员工
     */
    @RequestMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id) {
        employeeService.getBaseMapper().deleteById(id);
        return "redirect:/employees";
    }

    /**
     * 跳转到修改页面
     */
    @RequestMapping("/toUpdateEmp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeService.getBaseMapper().selectById(id);
        model.addAttribute("employee", employee);
        return "emp/update";
    }

    /**
     * 修改员工
     */
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee) {
        employeeService.getBaseMapper().updateById(employee);
        return "redirect:/employees";
    }


}
