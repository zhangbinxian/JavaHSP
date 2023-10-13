package com.bx_cha.mhl.service;

import com.bx_cha.mhl.dao.EmployeeDAO;
import com.bx_cha.mhl.domain.Employee;

/**
 * @author bx_cha
 * @version 1.0
 * 该类完成对employee表的各种操作(通过调用EmployeeDAO对象完成)
 */
public class EmployeeService {
    //定义一个 EmployeeDAO 属性
    private EmployeeDAO employeeDAO = new EmployeeDAO();

    //方法，根据empId 和 pwd 返回一个Employee对象
    //如果查询不到，就返回null
    public Employee getEmployeeByIdAndPwd(String empId, String pwd) {
        // 密码使用了md5加密
        String sql = "select * from employee where empId=? and pwd=md5(?)";
        return employeeDAO.querySingle(sql, Employee.class, empId, pwd);
    }
}
