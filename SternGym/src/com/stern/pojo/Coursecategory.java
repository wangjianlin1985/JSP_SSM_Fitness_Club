// 
// 
// 

package com.stern.pojo;

public class Coursecategory
{
    private Integer cateId;
    private String cateName;
    
    public Integer getCateId() {
        return this.cateId;
    }
    
    public void setCateId(final Integer cateId) {
        this.cateId = cateId;
    }
    
    public String getCateName() {
        return this.cateName;
    }
    
    public void setCateName(final String cateName) {
        this.cateName = ((cateName == null) ? null : cateName.trim());
    }
}
