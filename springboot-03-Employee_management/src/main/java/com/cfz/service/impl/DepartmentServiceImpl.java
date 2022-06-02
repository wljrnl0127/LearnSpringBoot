package com.cfz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cfz.mapper.DepartmentMapper;
import com.cfz.pojo.Department;
import com.cfz.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {
}
