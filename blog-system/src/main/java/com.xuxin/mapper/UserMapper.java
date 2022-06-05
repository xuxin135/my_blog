package com.xuxin.mapper;

import com.xuxin.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);
    void deleteUserById(int id);
    void deleteUserByIds(int[] ids);
    void updateUser(User user);
}
