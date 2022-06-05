package com.xuxin.controller;

import com.xuxin.model.User;
import com.xuxin.service.IUserService;
import com.xuxin.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 获取所有用户
     * @return
     */
    @GetMapping("/getAllUsers")
    public Result getAllUsers() {
        try {
            List<User> userList = userService.getAllUsers();
            return Result.success(userList);
        }catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 根据ID查询用户
     * @param id 用户ID
     * @return
     */
    @GetMapping("/getUserById")
    public Result getUserById(int id) {
        try {
            User user = userService.getUserById(id);
            return Result.success(user);
    } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    public Result addUser(User user) {
        try {
            userService.addUser(user);
            return Result.success();
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 删除单个用户
     * @param id
     * @return
     */
    @DeleteMapping("/deleteUserById")
    public Result deleteUserById(int id) {
        try {
            userService.deleteUserById(id);
            return Result.success();
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 批量删除用户
     * @param ids
     * @return
     */
    @DeleteMapping("/{ids}")
    public Result deleteUserByIds(@PathVariable int[] ids) {
        try {
            userService.deleteUserByIds(ids);
            return Result.success();
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @PostMapping("/updateUser")
    public Result updateUser(User user) {
        try {
            userService.updateUser(user);
            return Result.success();
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }
}
