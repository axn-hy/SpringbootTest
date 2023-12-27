package com.study.hhy.mapper;

import com.study.hhy.pojo.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer rid);
    Role  selectByPrimaryKey(Integer rid);
    int updateByPrimaryKeySelective(Role role);
    int insert(Role role);

    int insertSelective(Role role);
    Role selectAuByRid(Integer rid);

}