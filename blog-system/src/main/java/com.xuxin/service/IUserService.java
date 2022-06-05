package com.xuxin.service;

import com.xuxin.model.User;

import java.util.List;

public interface IUserService {
    public List<User> getAllUsers();

    public User getUserById(int id);
    public void addUser(User user);
    public void deleteUserById(int id);
    public void deleteUserByIds(int[] ids);
    public void updateUser(User user);
}
