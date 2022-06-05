package com.xuxin.service.impl;

import com.xuxin.mapper.RoleMapper;
import com.xuxin.model.Role;
import com.xuxin.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    @Override
    public Role getRoleById(int id) {
        return roleMapper.getRoleById(id);
    }

    @Override
    public void addRole(Role role) {
        roleMapper.addRole(role);
    }

    @Override
    public void deleteRoleById(int id) {
        roleMapper.deleteRoleById(id);
    }

    @Override
    public void deleteRoleByIds(int[] ids) {
        roleMapper.deleteRoleByIds(ids);
    }

    @Override
    public void updateRole(Role role) {
        roleMapper.updateRole(role);
    }
}
