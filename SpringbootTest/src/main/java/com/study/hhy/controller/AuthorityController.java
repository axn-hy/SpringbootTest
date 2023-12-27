package com.study.hhy.controller;

import com.study.hhy.Service.AuthorityService;
import com.study.hhy.pojo.Authority;
import com.study.hhy.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorityController {
    @Autowired
    private AuthorityService as;
    @GetMapping("/authority/{aid}")//根据id获取作者信息
    public Object getOne(@PathVariable("aid") Integer aid) {
        return ResultUtil.success(as.getOneAu(aid));
    }

    @PostMapping("/authority/insert")//插入作者信息
    public  void InsertAuthority(@RequestBody Authority authority) {as.InsertAu(authority);
    }

    @PostMapping("/authority/update")//更新作者信息
    public  void UpdateAuthority(@RequestBody Authority authority){
        as.UpdateAu(authority);
    }
    @DeleteMapping("/authority/delete")//删除作者
    public  void DeleteAuthority(@PathVariable("aid") Integer aid){
        as.DeleteAu(aid);
    }
}
