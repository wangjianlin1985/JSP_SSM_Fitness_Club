// 
// 
// 

package com.stern.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.stern.pojo.Member;
import com.stern.pojo.MemberExample;
import org.springframework.stereotype.Component;

@Component
public interface MemberMapper
{
    long countByExample(MemberExample p0);
    
    int deleteByExample(MemberExample p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    int insert(Member p0);
    
    int insertSelective(Member p0);
    
    List<Member> selectByExample(MemberExample p0);
    
    Member selectByPrimaryKey(Integer p0);
    
    int updateByExampleSelective(@Param("record") Member p0, @Param("example") MemberExample p1);
    
    int updateByExample(@Param("record") Member p0, @Param("example") MemberExample p1);
    
    int updateByPrimaryKeySelective(Member p0);
    
    int updateByPrimaryKey(Member p0);
}
