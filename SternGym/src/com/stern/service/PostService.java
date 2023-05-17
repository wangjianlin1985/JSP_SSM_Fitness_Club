// 
// 
// 

package com.stern.service;

import com.stern.pojo.Post;
import java.util.List;
import com.stern.pojo.PostExample;

public interface PostService
{
    List<Post> selectByExample(PostExample p0);
}
