// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.Employee;
import com.stern.pojo.EmployeeExample;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeMapper
{
    long countByExample(EmployeeExample p0);
    
    int deleteByExample(EmployeeExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Employee p0);
    
    int insertSelective(Employee p0);
    
    List<Employee> selectByExample(EmployeeExample p0);
    
    Employee selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Employee p0, @Param("example") EmployeeExample p1);
    
    int updateByExample(@Param("record") Employee p0, @Param("example") EmployeeExample p1);
    
    int updateByPrimaryKeySelective(Employee p0);
    
    int updateByPrimaryKey(Employee p0);
}
