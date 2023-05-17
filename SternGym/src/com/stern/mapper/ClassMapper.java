// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.Class;
import com.stern.pojo.ClassExample;
import org.springframework.stereotype.Component;

@Component
public interface ClassMapper
{
    long countByExample(ClassExample p0);
    
    int deleteByExample(ClassExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Class p0);
    
    int insertSelective(Class p0);
    
    List<Class> selectByExample(ClassExample p0);
    
    Class selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Class p0, @Param("example") ClassExample p1);
    
    int updateByExample(@Param("record") Class p0, @Param("example") ClassExample p1);
    
    int updateByPrimaryKeySelective(Class p0);
    
    int updateByPrimaryKey(Class p0);
}
