// 
// 
// 

package com.stern.service;

import com.stern.pojo.TblOrderExample;
import java.util.List;
import com.stern.pojo.TblOrder;

public interface OrderService
{
    int insertSelective(TblOrder p0);
    
    List<TblOrder> selectAllOrderWithMember(String p0);
    
    int deleteByPrimaryKey(Integer p0);
    
    long countByExample(TblOrderExample p0);
    
    List<TblOrder> selectByExample(TblOrderExample p0);
}
