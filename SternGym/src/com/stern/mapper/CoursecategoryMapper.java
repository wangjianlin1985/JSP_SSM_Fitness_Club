// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.Coursecategory;
import com.stern.pojo.CoursecategoryExample;
import org.springframework.stereotype.Component;

@Component
public interface CoursecategoryMapper
{
    long countByExample(CoursecategoryExample p0);
    
    int deleteByExample(CoursecategoryExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Coursecategory p0);
    
    int insertSelective(Coursecategory p0);
    
    List<Coursecategory> selectByExample(CoursecategoryExample p0);
    
    Coursecategory selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Coursecategory p0, @Param("example") CoursecategoryExample p1);
    
    int updateByExample(@Param("record") Coursecategory p0, @Param("example") CoursecategoryExample p1);
    
    int updateByPrimaryKeySelective(Coursecategory p0);
    
    int updateByPrimaryKey(Coursecategory p0);
}
