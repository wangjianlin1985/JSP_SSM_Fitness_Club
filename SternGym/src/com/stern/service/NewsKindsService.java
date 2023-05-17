// 
// 
// 

package com.stern.service;

import com.stern.pojo.Newskinds;
import java.util.List;
import com.stern.pojo.NewskindsExample;

public interface NewsKindsService
{
    List<Newskinds> selectByExample(NewskindsExample p0);
}
