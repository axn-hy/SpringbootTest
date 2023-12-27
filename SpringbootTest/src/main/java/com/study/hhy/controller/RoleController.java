package com.study.hhy.controller;

import com.study.hhy.Service.RoleService;
import com.study.hhy.pojo.Role;
import com.study.hhy.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author HHY
 */
@RestController
public class RoleController {
        @Autowired
    private RoleService rs;
        @GetMapping("/role/{rid}")
    public  Object getOneRole(@PathVariable("rid") Integer rid){
            return ResultUtil.success(rs.getOneRo(rid));
        }
    @GetMapping("/rolemesage/{rid}")
    public Object getAllOne(@PathVariable("rid") Integer cid){
        return ResultUtil.success(rs.getOnemessage(cid));
    }
    @PostMapping("/role/insert")
    public  void InsertRole(@RequestBody Role role) {
        rs.InsertRo(role);
    }

    @PostMapping("/role/update")
    public  void UpdateRole(@RequestBody Role role){
        rs.UpdateRo(role);
    }
    @DeleteMapping("/role/delete")
    public  void DeletRole(@PathVariable("rid") Integer rid){
        rs.DeleteRo(rid);
    }

}
