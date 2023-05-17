// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.Course;
import com.stern.pojo.CourseExample;
import org.springframework.stereotype.Component;

@Component
public interface CourseMapper
{
    long countByExample(CourseExample p0);
    
    int deleteByExample(CourseExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Course p0);
    
    int insertSelective(Course p0);
    
    List<Course> selectByExampleWithBLOBs(CourseExample p0);
    
    List<Course> selectByExample(CourseExample p0);
    
    Course selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Course p0, @Param("example") CourseExample p1);
    
    int updateByExampleWithBLOBs(@Param("record") Course p0, @Param("example") CourseExample p1);
    
    int updateByExample(@Param("record") Course p0, @Param("example") CourseExample p1);
    
    int updateByPrimaryKeySelective(Course p0);
    
    int updateByPrimaryKeyWithBLOBs(Course p0);
    
    int updateByPrimaryKey(Course p0);
}
