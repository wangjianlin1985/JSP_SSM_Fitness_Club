// 
// 
// 

package com.stern.service.impl;

import java.util.List;
import com.stern.pojo.EmployeeExample;
import com.stern.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;
import com.stern.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    private EmployeeMapper employeeMapper;
    
    @Override
    public int insertSelective(final Employee record) {
        return this.employeeMapper.insertSelective(record);
    }
    
    @Override
    public List<Employee> selectByExample(final EmployeeExample example) {
        return this.employeeMapper.selectByExample(example);
    }
    
    @Override
    public Employee selectByPrimaryKey(final Integer eid) {
        return this.employeeMapper.selectByPrimaryKey(eid);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final Employee record) {
        return this.employeeMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int deleteByPrimaryKey(final Integer eid) {
        return this.employeeMapper.deleteByPrimaryKey(eid);
    }
}
