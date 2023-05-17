// 
// 
// 

package com.stern.pojo;

import java.util.Date;

public class Reply
{
    private Integer rid;
    private String rcontent;
    private Date rdate;
    private Integer rMsgId;
    
    public Integer getRid() {
        return this.rid;
    }
    
    public void setRid(final Integer rid) {
        this.rid = rid;
    }
    
    public String getRcontent() {
        return this.rcontent;
    }
    
    public void setRcontent(final String rcontent) {
        this.rcontent = ((rcontent == null) ? null : rcontent.trim());
    }
    
    public Date getRdate() {
        return this.rdate;
    }
    
    public void setRdate(final Date rdate) {
        this.rdate = rdate;
    }
    
    public Integer getrMsgId() {
        return this.rMsgId;
    }
    
    public void setrMsgId(final Integer rMsgId) {
        this.rMsgId = rMsgId;
    }
}
