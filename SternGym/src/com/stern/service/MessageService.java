// 
// 
// 

package com.stern.service;

import com.stern.pojo.Reply;
import java.util.List;
import com.stern.pojo.MessageExample;
import com.stern.pojo.Message;

public interface MessageService
{
    int insertSelective(Message p0);
    
    List<Message> selectByExample(MessageExample p0);
    
    List<Message> selectMessageWithReply(Integer p0);
    
    List<Message> selectAllMessageWithReplyAndMember(String p0);
    
    int insertSelective(Reply p0);
    
    int deleteReplyByPrimaryKey(Integer p0);
    
    int deleteMsgByPrimaryKey(Integer p0);
}
