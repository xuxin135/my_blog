package com.xuxin.service.impl;

import com.xuxin.mapper.UserMapper;
import com.xuxin.model.User;
import com.xuxin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void deleteUserById(int id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void deleteUserByIds(int[] ids) {
        userMapper.deleteUserByIds(ids);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
