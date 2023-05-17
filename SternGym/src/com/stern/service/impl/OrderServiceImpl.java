// 
// 
// 

package com.stern.service.impl;

import com.stern.pojo.TblOrderExample;
import java.util.List;
import com.stern.pojo.TblOrder;
import org.springframework.beans.factory.annotation.Autowired;
import com.stern.mapper.TblOrderMapper;
import org.springframework.stereotype.Service;
import com.stern.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService
{
    @Autowired
    private TblOrderMapper tblOrderMapper;
    
    @Override
    public int insertSelective(final TblOrder record) {
        return this.tblOrderMapper.insertSelective(record);
    }
    
    @Override
    public List<TblOrder> selectAllOrderWithMember(final String mname) {
        return this.tblOrderMapper.selectAllOrderWithMember(mname);
    }
    
    @Override
    public int deleteByPrimaryKey(final Integer oid) {
        return this.tblOrderMapper.deleteByPrimaryKey(oid);
    }
    
    @Override
    public long countByExample(final TblOrderExample example) {
        return this.tblOrderMapper.countByExample(example);
    }
    
    @Override
    public List<TblOrder> selectByExample(final TblOrderExample example) {
        return this.tblOrderMapper.selectByExample(example);
    }
}
