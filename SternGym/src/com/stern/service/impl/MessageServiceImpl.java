// 
// 
// 

package com.stern.service.impl;

import com.stern.pojo.Reply;
import java.util.List;
import com.stern.pojo.MessageExample;
import com.stern.pojo.Message;
import com.stern.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.mapper.MessageMapper;
import org.springframework.stereotype.Service;
import com.stern.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService
{
    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private ReplyMapper replyMapper;
    
    @Override
    public int insertSelective(final Message record) {
        return this.messageMapper.insertSelective(record);
    }
    
    @Override
    public List<Message> selectByExample(final MessageExample example) {
        return this.messageMapper.selectByExample(example);
    }
    
    @Override
    public List<Message> selectMessageWithReply(final Integer msgMid) {
        return this.messageMapper.selectMessageWithReply(msgMid);
    }
    
    @Override
    public List<Message> selectAllMessageWithReplyAndMember(final String msgcontent) {
        return this.messageMapper.selectAllMessageWithReplyAndMember(msgcontent);
    }
    
    @Override
    public int insertSelective(final Reply record) {
        return this.replyMapper.insertSelective(record);
    }
    
    @Override
    public int deleteReplyByPrimaryKey(final Integer rid) {
        return this.replyMapper.deleteByPrimaryKey(rid);
    }
    
    @Override
    public int deleteMsgByPrimaryKey(final Integer msgId) {
        return this.messageMapper.deleteByPrimaryKey(msgId);
    }
}
