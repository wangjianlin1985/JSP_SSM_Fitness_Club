// 
// 
// 

package com.stern.service;

import java.util.List;
import com.stern.pojo.MemberExample;
import com.stern.pojo.Member;

public interface MemberService
{
    void addMember(Member p0);
    
    Member selectMemberByNameAndPwd(String p0, String p1);
    
    List<Member> selectByExample(MemberExample p0);
    
    Member selectByPrimaryKey(Integer p0);
    
    int updateByPrimaryKeySelective(Member p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    long countByExample(MemberExample p0);
}
