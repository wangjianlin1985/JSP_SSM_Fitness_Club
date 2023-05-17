// 
// 
// 

package com.stern.pojo;

import java.math.BigDecimal;

public class Post
{
    private Integer pid;
    private String pname;
    private BigDecimal psalary;
    
    public Integer getPid() {
        return this.pid;
    }
    
    public void setPid(final Integer pid) {
        this.pid = pid;
    }
    
    public String getPname() {
        return this.pname;
    }
    
    public void setPname(final String pname) {
        this.pname = ((pname == null) ? null : pname.trim());
    }
    
    public BigDecimal getPsalary() {
        return this.psalary;
    }
    
    public void setPsalary(final BigDecimal psalary) {
        this.psalary = psalary;
    }
}
