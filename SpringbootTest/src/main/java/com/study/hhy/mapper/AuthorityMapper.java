package com.study.hhy.mapper;

import com.study.hhy.pojo.Authority;

public interface AuthorityMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);
}