// 
// 
// 

package com.stern.service.impl;

import java.util.Date;
import java.util.List;
import com.stern.pojo.MemberExample;
import com.stern.utils.Funcs;
import com.stern.pojo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.mapper.MemberMapper;
import org.springframework.stereotype.Service;
import com.stern.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService
{
    @Autowired
    private MemberMapper memberMapper;
    
    @Override
    public void addMember(final Member member) {
        final String oldPwd = member.getMpassword();
        final String md5Pwd = Funcs.MD5("stern" + oldPwd);
        member.setMpassword(md5Pwd);
        this.memberMapper.insert(member);
    }
    
    @Override
    public Member selectMemberByNameAndPwd(final String mname, final String mpassword) {
        final String md5Pwd = Funcs.MD5("stern" + mpassword);
        final MemberExample memberExample = new MemberExample();
        final MemberExample.Criteria criteria = memberExample.createCriteria();
        criteria.andMnameEqualTo(mname);
        criteria.andMpasswordEqualTo(md5Pwd);
        final List<Member> members = this.memberMapper.selectByExample(memberExample);
        if (members.size() > 0) {
            return members.get(0);
        }
        return null;
    }
    
    @Override
    public List<Member> selectByExample(final MemberExample example) {
        final List<Member> members = this.memberMapper.selectByExample(example);
        return members;
    }
    
    @Override
    public Member selectByPrimaryKey(final Integer mid) {
        return this.memberMapper.selectByPrimaryKey(mid);
    }
    
    @Override
    public int updateByPrimaryKeySelective(final Member record) {
        return this.memberMapper.updateByPrimaryKeySelective(record);
    }
    
    @Override
    public int deleteByPrimaryKey(final Integer mid) {
        return this.memberMapper.deleteByPrimaryKey(mid);
    }
    
    @Override
    public long countByExample(final MemberExample example) {
        return this.memberMapper.countByExample(example);
    }
}
