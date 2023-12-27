package com.study.hhy.Service;

import com.study.hhy.pojo.Role;

public interface RoleService {
    Role getOneRo(Integer rid);

    public void InsertRo(Role role);

    void UpdateRo(Role role);

    void DeleteRo(Integer rid);
    Role  getOnemessage(Integer rid);
}
