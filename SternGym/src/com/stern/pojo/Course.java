// 
// 
// 

package com.stern.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Course
{
    private Integer cid;
    private String cname;
    private Integer trainerId;
    private Integer ctime;
    private Integer cfunctionId;
    private Integer ccateId;
    private String cpic;
    private Date ccreatetime;
    private BigDecimal cprice;
    private String cdesc;
    
    public Integer getCid() {
        return this.cid;
    }
    
    public void setCid(final Integer cid) {
        this.cid = cid;
    }
    
    public String getCname() {
        return this.cname;
    }
    
    public void setCname(final String cname) {
        this.cname = ((cname == null) ? null : cname.trim());
    }
    
    public Integer getTrainerId() {
        return this.trainerId;
    }
    
    public void setTrainerId(final Integer trainerId) {
        this.trainerId = trainerId;
    }
    
    public Integer getCtime() {
        return this.ctime;
    }
    
    public void setCtime(final Integer ctime) {
        this.ctime = ctime;
    }
    
    public Integer getCfunctionId() {
        return this.cfunctionId;
    }
    
    public void setCfunctionId(final Integer cfunctionId) {
        this.cfunctionId = cfunctionId;
    }
    
    public Integer getCcateId() {
        return this.ccateId;
    }
    
    public void setCcateId(final Integer ccateId) {
        this.ccateId = ccateId;
    }
    
    public String getCpic() {
        return this.cpic;
    }
    
    public void setCpic(final String cpic) {
        this.cpic = ((cpic == null) ? null : cpic.trim());
    }
    
    public Date getCcreatetime() {
        return this.ccreatetime;
    }
    
    public void setCcreatetime(final Date ccreatetime) {
        this.ccreatetime = ccreatetime;
    }
    
    public BigDecimal getCprice() {
        return this.cprice;
    }
    
    public void setCprice(final BigDecimal cprice) {
        this.cprice = cprice;
    }
    
    public String getCdesc() {
        return this.cdesc;
    }
    
    public void setCdesc(final String cdesc) {
        this.cdesc = ((cdesc == null) ? null : cdesc.trim());
    }
}
