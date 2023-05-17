// 
// 
// 

package com.stern.service;

import java.util.List;
import com.stern.pojo.EmployeeExample;
import com.stern.pojo.Employee;

public interface EmployeeService
{
    int insertSelective(Employee p0);
    
    List<Employee> selectByExample(EmployeeExample p0);
    
    Employee selectByPrimaryKey(Integer p0);
    
    int updateByPrimaryKeySelective(Employee p0);
    
    int deleteByPrimaryKey(Integer p0);
}
