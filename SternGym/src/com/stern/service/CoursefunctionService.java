// 
// 
// 

package com.stern.service;

import com.stern.pojo.Coursefunction;
import java.util.List;
import com.stern.pojo.CoursefunctionExample;

public interface CoursefunctionService
{
    List<Coursefunction> selectByExample(CoursefunctionExample p0);
}
