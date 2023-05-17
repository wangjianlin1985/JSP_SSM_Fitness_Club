// 
// 
// 

package com.stern.service.impl;

import com.stern.pojo.News;
import java.util.List;
import com.stern.pojo.NewsExample;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.mapper.NewsMapper;
import org.springframework.stereotype.Service;
import com.stern.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService
{
    @Autowired
    private NewsMapper newsMapper;
    
    @Override
    public List<News> selectByExampleWithBLOBs(final NewsExample example) {
        return this.newsMapper.selectByExampleWithBLOBs(example);
    }
    
    @Override
    public News selectByPrimaryKey(final Integer nid) {
        return this.newsMapper.selectByPrimaryKey(nid);
    }
    
    @Override
    public int insertSelective(final News record) {
        return this.newsMapper.insertSelective(record);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final News record) {
        return this.newsMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int deleteByPrimaryKey(final Integer nid) {
        return this.newsMapper.deleteByPrimaryKey(nid);
    }
}
