// 
// 
// 

package com.stern.service.impl;

import com.stern.pojo.SheetExample;
import com.stern.pojo.Sheet;
import com.stern.pojo.Course;
import java.util.List;
import com.stern.pojo.CourseExample;
import com.stern.mapper.SheetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.mapper.CourseMapper;
import org.springframework.stereotype.Service;
import com.stern.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService
{
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private SheetMapper sheetMapper;
    
    @Override
    public List<Course> selectByExample(final CourseExample example) {
        return this.courseMapper.selectByExample(new CourseExample());
    }
    
    @Override
    public List<Course> selectByExampleWithBLOBs(final CourseExample example) {
        return this.courseMapper.selectByExampleWithBLOBs(example);
    }
    
    @Override
    public Course selectByPrimaryKey(final Integer cid) {
        return this.courseMapper.selectByPrimaryKey(cid);
    }
    
    @Override
    public int insertSelective(final Course record) {
        return this.courseMapper.insertSelective(record);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final Course record) {
        return this.courseMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int deleteByPrimaryKey(final Integer cid) {
        return this.courseMapper.deleteByPrimaryKey(cid);
    }
    
    @Override
    public int insertSelective(final Sheet record) {
        return this.sheetMapper.insertSelective(record);
    }
    
    @Override
    public long countByExample(final SheetExample example) {
        return this.sheetMapper.countByExample(example);
    }
    
    @Override
    public int updateByPrimaryKey(final Sheet record) {
        return this.sheetMapper.updateByPrimaryKey(record);
    }
    
    @Override
    public Sheet selectSheetByPrimaryKey(final Integer sid) {
        return this.sheetMapper.selectByPrimaryKey(sid);
    }
}
