// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.Newskinds;
import com.stern.pojo.NewskindsExample;
import org.springframework.stereotype.Component;

@Component
public interface NewskindsMapper
{
    long countByExample(NewskindsExample p0);
    
    int deleteByExample(NewskindsExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Newskinds p0);
    
    int insertSelective(Newskinds p0);
    
    List<Newskinds> selectByExample(NewskindsExample p0);
    
    Newskinds selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Newskinds p0, @Param("example") NewskindsExample p1);
    
    int updateByExample(@Param("record") Newskinds p0, @Param("example") NewskindsExample p1);
    
    int updateByPrimaryKeySelective(Newskinds p0);
    
    int updateByPrimaryKey(Newskinds p0);
}
