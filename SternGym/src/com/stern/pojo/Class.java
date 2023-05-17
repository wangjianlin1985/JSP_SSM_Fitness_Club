// 
// 
// 

package com.stern.pojo;

public class Class
{
    private Integer classid;
    private Integer haveOrder;
    private Integer courseId;
    private String classtime;
    private Integer emplId;
    private Integer classvolume;
    
    public Integer getClassid() {
        return this.classid;
    }
    
    public void setClassid(final Integer classid) {
        this.classid = classid;
    }
    
    public Integer getHaveOrder() {
        return this.haveOrder;
    }
    
    public void setHaveOrder(final Integer haveOrder) {
        this.haveOrder = haveOrder;
    }
    
    public Integer getCourseId() {
        return this.courseId;
    }
    
    public void setCourseId(final Integer courseId) {
        this.courseId = courseId;
    }
    
    public String getClasstime() {
        return this.classtime;
    }
    
    public void setClasstime(final String classtime) {
        this.classtime = ((classtime == null) ? null : classtime.trim());
    }
    
    public Integer getEmplId() {
        return this.emplId;
    }
    
    public void setEmplId(final Integer emplId) {
        this.emplId = emplId;
    }
    
    public Integer getClassvolume() {
        return this.classvolume;
    }
    
    public void setClassvolume(final Integer classvolume) {
        this.classvolume = classvolume;
    }
}
