package com.cfz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cfz.mapper.EmployeeMapper;
import com.cfz.pojo.Employee;
import com.cfz.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
