// 
// 
// 

package com.stern.service.impl;

import com.stern.pojo.Post;
import java.util.List;
import com.stern.pojo.PostExample;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.mapper.PostMapper;
import org.springframework.stereotype.Service;
import com.stern.service.PostService;

@Service
public class PostServiceImpl implements PostService
{
    @Autowired
    private PostMapper postMapper;
    
    @Override
    public List<Post> selectByExample(final PostExample example) {
        return this.postMapper.selectByExample(example);
    }
}
