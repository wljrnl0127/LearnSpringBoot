package com.cfz;

import com.cfz.mapper.DepartmentMapper;
import com.cfz.mapper.EmployeeMapper;
import com.cfz.pojo.Department;
import com.cfz.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class Springboot03EmployeeManagementApplicationTests {

    //继承了BaseMapper，所以可以直接使用BaseMapper中的方法
    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private DepartmentMapper departmentMapper;


    @Test
    void contextLoads() {
        List<Employee> employees = employeeMapper.selectList(null);
        employees.forEach(System.out::println);
    }

    @Test
    void testDepartment() {
        List<Department> departments = departmentMapper.selectList(null);
        departments.forEach(System.out::println);
    }

    /**
     * 测试插入数据
     */
    @Test
    void testInsert() {
        Employee employee = new Employee();
        employee.setName("张三");
        employee.setGender(0);
        employeeMapper.insert(employee);
    }

    @Autowired
    DataSource dataSource;

    @Test
    void testDataSource() throws SQLException {
//        查看默认数据源：com.zaxxer.hikari.HikariDataSource
        System.out.println(dataSource.getClass());

//        获得数据库连接：
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

//        关闭连接：
        connection.close();
    }

}
