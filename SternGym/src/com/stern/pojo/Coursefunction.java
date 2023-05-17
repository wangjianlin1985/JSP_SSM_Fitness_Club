// 
// 
// 

package com.stern.pojo;

public class Coursefunction
{
    private Integer fid;
    private String fname;
    
    public Integer getFid() {
        return this.fid;
    }
    
    public void setFid(final Integer fid) {
        this.fid = fid;
    }
    
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(final String fname) {
        this.fname = ((fname == null) ? null : fname.trim());
    }
}
