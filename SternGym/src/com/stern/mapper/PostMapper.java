// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.Post;
import com.stern.pojo.PostExample;
import org.springframework.stereotype.Component;

@Component
public interface PostMapper
{
    long countByExample(PostExample p0);
    
    int deleteByExample(PostExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Post p0);
    
    int insertSelective(Post p0);
    
    List<Post> selectByExample(PostExample p0);
    
    Post selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Post p0, @Param("example") PostExample p1);
    
    int updateByExample(@Param("record") Post p0, @Param("example") PostExample p1);
    
    int updateByPrimaryKeySelective(Post p0);
    
    int updateByPrimaryKey(Post p0);
}
