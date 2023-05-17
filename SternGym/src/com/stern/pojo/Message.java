// 
// 
// 

package com.stern.pojo;

import java.util.Date;

public class Message
{
    private Reply reply;
    private Member member;
    private Integer msgId;
    private Integer msgMid;
    private String msgContent;
    private Integer msgRid;
    private Date msgDate;
    
    public Member getMember() {
        return this.member;
    }
    
    public void setMember(final Member member) {
        this.member = member;
    }
    
    public Reply getReply() {
        return this.reply;
    }
    
    public void setReply(final Reply reply) {
        this.reply = reply;
    }
    
    public Integer getMsgId() {
        return this.msgId;
    }
    
    public void setMsgId(final Integer msgId) {
        this.msgId = msgId;
    }
    
    public Integer getMsgMid() {
        return this.msgMid;
    }
    
    public void setMsgMid(final Integer msgMid) {
        this.msgMid = msgMid;
    }
    
    public String getMsgContent() {
        return this.msgContent;
    }
    
    public void setMsgContent(final String msgContent) {
        this.msgContent = ((msgContent == null) ? null : msgContent.trim());
    }
    
    public Integer getMsgRid() {
        return this.msgRid;
    }
    
    public void setMsgRid(final Integer msgRid) {
        this.msgRid = msgRid;
    }
    
    public Date getMsgDate() {
        return this.msgDate;
    }
    
    public void setMsgDate(final Date msgDate) {
        this.msgDate = msgDate;
    }
}
