// 
// 
// 

package com.stern.service.impl;

import com.stern.pojo.Coursefunction;
import java.util.List;
import com.stern.pojo.CoursefunctionExample;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.mapper.CoursefunctionMapper;
import org.springframework.stereotype.Service;
import com.stern.service.CoursefunctionService;

@Service
public class CoursefunctionServiceImpl implements CoursefunctionService
{
    @Autowired
    private CoursefunctionMapper coursefunctionMapper;
    
    @Override
    public List<Coursefunction> selectByExample(final CoursefunctionExample example) {
        return this.coursefunctionMapper.selectByExample(example);
    }
}
