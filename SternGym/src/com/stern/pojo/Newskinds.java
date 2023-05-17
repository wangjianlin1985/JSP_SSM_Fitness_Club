// 
// 
// 

package com.stern.pojo;

public class Newskinds
{
    private Integer nkid;
    private String nkname;
    
    public Integer getNkid() {
        return this.nkid;
    }
    
    public void setNkid(final Integer nkid) {
        this.nkid = nkid;
    }
    
    public String getNkname() {
        return this.nkname;
    }
    
    public void setNkname(final String nkname) {
        this.nkname = ((nkname == null) ? null : nkname.trim());
    }
}
