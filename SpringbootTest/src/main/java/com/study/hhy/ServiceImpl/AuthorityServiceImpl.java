package com.study.hhy.ServiceImpl;

import com.study.hhy.Service.AuthorityService;
import com.study.hhy.mapper.AuthorityMapper;
import com.study.hhy.pojo.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,rollbackFor =Exception.class)
public class AuthorityServiceImpl  implements AuthorityService {
    @Autowired
    private AuthorityMapper am;
    @Override
    public Authority getOneAu(Integer aid) {
        return am.selectByPrimaryKey(aid);
    }

    @Override
    public void InsertAu(Authority authority) {
        am.insert(authority);
    }

    @Override
    public void UpdateAu(Authority authority) {
        am.updateByPrimaryKeySelective(authority);
    }

    @Override
    public void DeleteAu(Integer aid) {
        am.deleteByPrimaryKey(aid);
    }

}
