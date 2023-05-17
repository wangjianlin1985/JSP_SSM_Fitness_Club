// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.Reply;
import com.stern.pojo.ReplyExample;
import org.springframework.stereotype.Component;

@Component
public interface ReplyMapper
{
    long countByExample(ReplyExample p0);
    
    int deleteByExample(ReplyExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Reply p0);
    
    int insertSelective(Reply p0);
    
    List<Reply> selectByExample(ReplyExample p0);
    
    Reply selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Reply p0, @Param("example") ReplyExample p1);
    
    int updateByExample(@Param("record") Reply p0, @Param("example") ReplyExample p1);
    
    int updateByPrimaryKeySelective(Reply p0);
    
    int updateByPrimaryKey(Reply p0);
}
