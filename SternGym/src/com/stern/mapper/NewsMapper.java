// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.News;
import com.stern.pojo.NewsExample;
import org.springframework.stereotype.Component;

@Component
public interface NewsMapper
{
    long countByExample(NewsExample p0);
    
    int deleteByExample(NewsExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(News p0);
    
    int insertSelective(News p0);
    
    List<News> selectByExampleWithBLOBs(NewsExample p0);
    
    List<News> selectByExample(NewsExample p0);
    
    News selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") News p0, @Param("example") NewsExample p1);
    
    int updateByExampleWithBLOBs(@Param("record") News p0, @Param("example") NewsExample p1);
    
    int updateByExample(@Param("record") News p0, @Param("example") NewsExample p1);
    
    int updateByPrimaryKeySelective(News p0);
    
    int updateByPrimaryKeyWithBLOBs(News p0);
    
    int updateByPrimaryKey(News p0);
}
