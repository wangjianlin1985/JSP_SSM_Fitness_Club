// 
// 
// 

package com.stern.service.impl;

import com.stern.pojo.Newskinds;
import java.util.List;
import com.stern.pojo.NewskindsExample;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.mapper.NewskindsMapper;
import org.springframework.stereotype.Service;
import com.stern.service.NewsKindsService;

@Service
public class NewsKindsServiceImpl implements NewsKindsService
{
    @Autowired
    private NewskindsMapper newskindsMapper;
    
    @Override
    public List<Newskinds> selectByExample(final NewskindsExample example) {
        return this.newskindsMapper.selectByExample(example);
    }
}
