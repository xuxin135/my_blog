package com.xuxin.controller;

import com.xuxin.model.Role;
import com.xuxin.service.IRoleService;
import com.xuxin.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    /**
     * 查询所有角色
     * @return
     */
    @GetMapping("/getAllRoles")
    public Result getAllRoles() {
        try {
            List<Role> roles = roleService.getAllRoles();
            return Result.success(roles);
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 查询单个角色
     * @param id
     * @return
     */
    @GetMapping("/getRoleById")
    public Result getRoleById(int id) {
        try {
            Role role = roleService.getRoleById(id);
            return Result.success(role);
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 添加角色
     * @param role
     * @return
     */
    @PostMapping("/addRole")
    public Result addRole(Role role) {
        try {
            roleService.addRole(role);
            return Result.success();
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 删除角色
     * @param id
     * @return
     */
    @DeleteMapping("/deleteRoleById")
    public Result deleteRoleById(int id) {
        try {
            roleService.deleteRoleById(id);
            return Result.success();
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 批量删除角色
     * @param ids
     * @return
     */
    @DeleteMapping("/{ids}")
    public Result deleteRoleByIds(@PathVariable int[] ids) {
        try {
            roleService.deleteRoleByIds(ids);
            return Result.success();
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 修改角色
     * @param role
     * @return
     */
    @PostMapping("/updateRole")
    public Result updateRole(Role role) {
        try {
            roleService.updateRole(role);
            return Result.success();
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

}
