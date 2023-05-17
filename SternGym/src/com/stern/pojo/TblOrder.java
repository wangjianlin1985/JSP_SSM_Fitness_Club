// 
// 
// 

package com.stern.pojo;

import java.util.Date;

public class TblOrder
{
    private Member member;
    private Integer oid;
    private Integer memberId;
    private Date ocreatetime;
    private Integer classId;
    private Integer ostatus;
    
    public Member getMember() {
        return this.member;
    }
    
    public void setMember(final Member member) {
        this.member = member;
    }
    
    public Integer getOid() {
        return this.oid;
    }
    
    public void setOid(final Integer oid) {
        this.oid = oid;
    }
    
    public Integer getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(final Integer memberId) {
        this.memberId = memberId;
    }
    
    public Date getOcreatetime() {
        return this.ocreatetime;
    }
    
    public void setOcreatetime(final Date ocreatetime) {
        this.ocreatetime = ocreatetime;
    }
    
    public Integer getClassId() {
        return this.classId;
    }
    
    public void setClassId(final Integer classId) {
        this.classId = classId;
    }
    
    public Integer getOstatus() {
        return this.ostatus;
    }
    
    public void setOstatus(final Integer ostatus) {
        this.ostatus = ostatus;
    }
}
