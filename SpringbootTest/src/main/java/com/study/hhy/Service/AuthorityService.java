package com.study.hhy.Service;


import com.study.hhy.pojo.Authority;

public interface AuthorityService {
    Authority getOneAu(Integer aid);

    public void InsertAu(Authority authority);

    void UpdateAu(Authority authority);

    void DeleteAu(Integer aid);
}
