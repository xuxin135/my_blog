package com.xuxin.service;

import com.xuxin.model.Role;

import java.util.List;

public interface IRoleService {
    List<Role> getAllRoles();
    Role getRoleById(int id);
    void addRole(Role role);
    void deleteRoleById(int id);
    void deleteRoleByIds(int[] ids);
    void updateRole(Role role);
}
