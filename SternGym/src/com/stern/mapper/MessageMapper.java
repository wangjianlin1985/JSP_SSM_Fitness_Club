// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.Message;
import com.stern.pojo.MessageExample;
import org.springframework.stereotype.Component;

@Component
public interface MessageMapper
{
    long countByExample(MessageExample p0);
    
    int deleteByExample(MessageExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Message p0);
    
    int insertSelective(Message p0);
    
    List<Message> selectByExample(MessageExample p0);
    
    List<Message> selectMessageWithReply(Integer p0);
    
    List<Message> selectAllMessageWithReplyAndMember(String p0);
    
    Message selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Message p0, @Param("example") MessageExample p1);
    
    int updateByExample(@Param("record") Message p0, @Param("example") MessageExample p1);
    
    int updateByPrimaryKeySelective(Message p0);
    
    int updateByPrimaryKey(Message p0);
}
