// 
// 
// 

package com.stern.service.impl;

import com.stern.pojo.Coursecategory;
import java.util.List;
import com.stern.pojo.CoursecategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.mapper.CoursecategoryMapper;
import org.springframework.stereotype.Service;
import com.stern.service.CoursecategoryService;

@Service
public class CoursecategoryServiceImpl implements CoursecategoryService
{
    @Autowired
    private CoursecategoryMapper coursecategoryMapper;
    
    @Override
    public List<Coursecategory> selectByExample(final CoursecategoryExample example) {
        return this.coursecategoryMapper.selectByExample(example);
    }
}
