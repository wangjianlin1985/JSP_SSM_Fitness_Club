// 
// 
// 

package com.stern.service;

import com.stern.pojo.Coursecategory;
import java.util.List;
import com.stern.pojo.CoursecategoryExample;

public interface CoursecategoryService
{
    List<Coursecategory> selectByExample(CoursecategoryExample p0);
}
