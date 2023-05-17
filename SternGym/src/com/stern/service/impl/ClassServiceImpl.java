// 
// 
// 

package com.stern.service.impl;

import com.stern.pojo.Class;
import java.util.List;
import com.stern.pojo.ClassExample;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.mapper.ClassMapper;
import org.springframework.stereotype.Service;
import com.stern.service.ClassService;

@Service
public class ClassServiceImpl implements ClassService
{
    @Autowired
    private ClassMapper classMapper;
    
    @Override
    public List<Class> selectByExample(final ClassExample example) {
        return this.classMapper.selectByExample(example);
    }
    
    @Override
    public Class selectByPrimaryKey(final Integer classid) {
        return this.classMapper.selectByPrimaryKey(classid);
    }
}
