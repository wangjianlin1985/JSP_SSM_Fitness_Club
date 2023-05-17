// 
// 
// 

package com.stern.pojo;

import java.util.Date;

public class News
{
    private Integer nid;
    private String ntitle;
    private Date ncreatetime;
    private Integer nkId;
    private String ncontent;
    
    public Integer getNid() {
        return this.nid;
    }
    
    public void setNid(final Integer nid) {
        this.nid = nid;
    }
    
    public String getNtitle() {
        return this.ntitle;
    }
    
    public void setNtitle(final String ntitle) {
        this.ntitle = ((ntitle == null) ? null : ntitle.trim());
    }
    
    public Date getNcreatetime() {
        return this.ncreatetime;
    }
    
    public void setNcreatetime(final Date ncreatetime) {
        this.ncreatetime = ncreatetime;
    }
    
    public Integer getNkId() {
        return this.nkId;
    }
    
    public void setNkId(final Integer nkId) {
        this.nkId = nkId;
    }
    
    public String getNcontent() {
        return this.ncontent;
    }
    
    public void setNcontent(final String ncontent) {
        this.ncontent = ((ncontent == null) ? null : ncontent.trim());
    }
}
