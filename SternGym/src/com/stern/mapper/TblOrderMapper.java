// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.TblOrder;
import com.stern.pojo.TblOrderExample;
import org.springframework.stereotype.Component;

@Component
public interface TblOrderMapper
{
    long countByExample(TblOrderExample p0);
    
    int deleteByExample(TblOrderExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(TblOrder p0);
    
    int insertSelective(TblOrder p0);
    
    List<TblOrder> selectByExample(TblOrderExample p0);
    
    List<TblOrder> selectAllOrderWithMember(String p0);
    
    TblOrder selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") TblOrder p0, @Param("example") TblOrderExample p1);
    
    int updateByExample(@Param("record") TblOrder p0, @Param("example") TblOrderExample p1);
    
    int updateByPrimaryKeySelective(TblOrder p0);
    
    int updateByPrimaryKey(TblOrder p0);
}
