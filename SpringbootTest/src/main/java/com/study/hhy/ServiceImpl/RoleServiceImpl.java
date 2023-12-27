package com.study.hhy.ServiceImpl;

import com.study.hhy.Service.RoleService;
import com.study.hhy.mapper.RoleMapper;
import com.study.hhy.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author HHY
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,rollbackFor =Exception.class)
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper rm;
    @Override
    public Role getOneRo(Integer rid) {
        return rm.selectByPrimaryKey(rid);
    }

    @Override
    public void InsertRo(Role role) {
        rm.insert(role);
    }

    @Override
    public void UpdateRo(Role role) {
        rm.updateByPrimaryKeySelective(role);
    }

    @Override
    public void DeleteRo(Integer rid) {
        rm.deleteByPrimaryKey(rid);
    }

    @Override
    public Role getOnemessage(Integer rid) {
     return    rm.selectAuByRid(rid);
    }
}
