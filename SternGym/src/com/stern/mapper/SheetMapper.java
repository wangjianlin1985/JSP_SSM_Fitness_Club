// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.Sheet;
import com.stern.pojo.SheetExample;
import org.springframework.stereotype.Component;

@Component
public interface SheetMapper
{
    long countByExample(SheetExample p0);
    
    int deleteByExample(SheetExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Sheet p0);
    
    int insertSelective(Sheet p0);
    
    List<Sheet> selectByExample(SheetExample p0);
    
    Sheet selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Sheet p0, @Param("example") SheetExample p1);
    
    int updateByExample(@Param("record") Sheet p0, @Param("example") SheetExample p1);
    
    int updateByPrimaryKeySelective(Sheet p0);
    
    int updateByPrimaryKey(Sheet p0);
}
