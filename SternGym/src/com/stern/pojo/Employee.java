// 
// 
// 

package com.stern.pojo;

import java.util.Date;

public class Employee
{
    private Integer eid;
    private String ename;
    private Byte egender;
    private String ephone;
    private Integer epostId;
    private String eadd;
    private Date ehire;
    private Integer estate;
    
    public Integer getEid() {
        return this.eid;
    }
    
    public void setEid(final Integer eid) {
        this.eid = eid;
    }
    
    public String getEname() {
        return this.ename;
    }
    
    public void setEname(final String ename) {
        this.ename = ((ename == null) ? null : ename.trim());
    }
    
    public Byte getEgender() {
        return this.egender;
    }
    
    public void setEgender(final Byte egender) {
        this.egender = egender;
    }
    
    public String getEphone() {
        return this.ephone;
    }
    
    public void setEphone(final String ephone) {
        this.ephone = ((ephone == null) ? null : ephone.trim());
    }
    
    public Integer getEpostId() {
        return this.epostId;
    }
    
    public void setEpostId(final Integer epostId) {
        this.epostId = epostId;
    }
    
    public String getEadd() {
        return this.eadd;
    }
    
    public void setEadd(final String eadd) {
        this.eadd = ((eadd == null) ? null : eadd.trim());
    }
    
    public Date getEhire() {
        return this.ehire;
    }
    
    public void setEhire(final Date ehire) {
        this.ehire = ehire;
    }
    
    public Integer getEstate() {
        return this.estate;
    }
    
    public void setEstate(final Integer estate) {
        this.estate = estate;
    }
}
