// 
// 
// 

package com.stern.service;

import com.stern.pojo.Class;
import java.util.List;
import com.stern.pojo.ClassExample;

public interface ClassService
{
    List<Class> selectByExample(ClassExample p0);
    
    Class selectByPrimaryKey(Integer p0);
}
