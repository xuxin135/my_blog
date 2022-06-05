package com.xuxin.mapper;

import com.xuxin.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    List<Role> getAllRoles();
    Role getRoleById(int id);
    void addRole(Role role);
    void deleteRoleById(int id);
    void deleteRoleByIds(int[] ids);
    void updateRole(Role role);
}
