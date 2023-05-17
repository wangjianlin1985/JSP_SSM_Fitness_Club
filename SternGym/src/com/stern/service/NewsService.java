// 
// 
// 

package com.stern.service;

import com.stern.pojo.News;
import java.util.List;
import com.stern.pojo.NewsExample;

public interface NewsService
{
    List<News> selectByExampleWithBLOBs(NewsExample p0);
    
    News selectByPrimaryKey(Integer p0);
    
    int insertSelective(News p0);
    
    int updateByPrimaryKeySelective(News p0);
    
    int deleteByPrimaryKey(Integer p0);
}
