// 
// 
// 

package com.stern.service;

import com.stern.pojo.SheetExample;
import com.stern.pojo.Sheet;
import com.stern.pojo.Course;
import java.util.List;
import com.stern.pojo.CourseExample;

public interface CourseService
{
    List<Course> selectByExample(CourseExample p0);
    
    List<Course> selectByExampleWithBLOBs(CourseExample p0);
    
    Course selectByPrimaryKey(Integer p0);
    
    int insertSelective(Course p0);
    
    int updateByPrimaryKeySelective(Course p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insertSelective(Sheet p0);
    
    long countByExample(SheetExample p0);
    
    int updateByPrimaryKey(Sheet p0);
    
    Sheet selectSheetByPrimaryKey(Integer p0);
}
