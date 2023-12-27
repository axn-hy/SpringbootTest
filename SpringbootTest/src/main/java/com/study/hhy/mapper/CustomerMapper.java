package com.study.hhy.mapper;

import com.study.hhy.pojo.Customer;

/**
 * @author HHY
 */
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Customer customer);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Customer customer);

    int updateByPrimaryKey(Customer record);

    Customer selectRoleByCid(Integer cid);
}