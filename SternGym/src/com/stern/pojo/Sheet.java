// 
// 
// 

package com.stern.pojo;

public class Sheet
{
    private Integer sid;
    private String ssrc;
    
    public Integer getSid() {
        return this.sid;
    }
    
    public void setSid(final Integer sid) {
        this.sid = sid;
    }
    
    public String getSsrc() {
        return this.ssrc;
    }
    
    public void setSsrc(final String ssrc) {
        this.ssrc = ((ssrc == null) ? null : ssrc.trim());
    }
}
