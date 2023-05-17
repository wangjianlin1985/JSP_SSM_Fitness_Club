// 
// 
// 

package com.stern.pojo;

import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

public class Member
{
    private Integer mid;
    @NotNull(message = "\u59d3\u540d\u4e0d\u80fd\u4e3a\u7a7a")
    @Size(min = 3, max = 6, message = "\u59d3\u540d\u957f\u5ea6\u5e94\u5728{min}-{max}\u4e4b\u95f4")
    private String mname;
    @Size(min = 6, message = "\u5bc6\u7801\u957f\u5ea6\u81f3\u5c11{min}\u4f4d")
    private String mpassword;
    private Integer mgender;
    @NotNull(message = "\u8eab\u4efd\u8bc1\u53f7\u4e0d\u80fd\u4e3a\u7a7a")
    @Size(max = 18, min = 18, message = "\u8bf7\u786e\u4fdd\u8eab\u4efd\u8bc1\u53f7\u7801\u4e3a{max}\u4f4d")
    private String midno;
    @NotNull(message = "\u624b\u673a\u53f7\u7801\u4e0d\u80fd\u4e3a\u7a7a")
    @Pattern(regexp = "^((13[0-9])|(15[^4,\\\\D])|(17[0-9])|(18[0-9]))\\d{8}$", message = "\u8bf7\u8f93\u5165\u6b63\u786e\u7684\u624b\u673a\u53f7\u7801")
    private String mphone;
    @NotNull(message = "\u90ae\u7bb1\u4e0d\u80fd\u4e3a\u7a7a")
    @Email(message = "\u8bf7\u786e\u4fdd\u4e3a\u6b63\u786e\u90ae\u7bb1")
    private String memail;
    private Date mdate;
    
    public Integer getMid() {
        return this.mid;
    }
    
    public void setMid(final Integer mid) {
        this.mid = mid;
    }
    
    public String getMname() {
        return this.mname;
    }
    
    public void setMname(final String mname) {
        this.mname = ((mname == null) ? null : mname.trim());
    }
    
    public String getMpassword() {
        return this.mpassword;
    }
    
    public void setMpassword(final String mpassword) {
        this.mpassword = ((mpassword == null) ? null : mpassword.trim());
    }
    
    public Integer getMgender() {
        return this.mgender;
    }
    
    public void setMgender(final Integer mgender) {
        this.mgender = mgender;
    }
    
    public String getMidno() {
        return this.midno;
    }
    
    public void setMidno(final String midno) {
        this.midno = ((midno == null) ? null : midno.trim());
    }
    
    public String getMphone() {
        return this.mphone;
    }
    
    public void setMphone(final String mphone) {
        this.mphone = ((mphone == null) ? null : mphone.trim());
    }
    
    public String getMemail() {
        return this.memail;
    }
    
    public void setMemail(final String memail) {
        this.memail = ((memail == null) ? null : memail.trim());
    }
    
    public Date getMdate() {
        return this.mdate;
    }
    
    public void setMdate(final Date mdate) {
        this.mdate = mdate;
    }
}
