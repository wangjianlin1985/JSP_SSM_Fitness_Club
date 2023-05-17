// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.Coursefunction;
import com.stern.pojo.CoursefunctionExample;
import org.springframework.stereotype.Component;

@Component
public interface CoursefunctionMapper
{
    long countByExample(CoursefunctionExample p0);
    
    int deleteByExample(CoursefunctionExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Coursefunction p0);
    
    int insertSelective(Coursefunction p0);
    
    List<Coursefunction> selectByExample(CoursefunctionExample p0);
    
    Coursefunction selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Coursefunction p0, @Param("example") CoursefunctionExample p1);
    
    int updateByExample(@Param("record") Coursefunction p0, @Param("example") CoursefunctionExample p1);
    
    int updateByPrimaryKeySelective(Coursefunction p0);
    
    int updateByPrimaryKey(Coursefunction p0);
}
