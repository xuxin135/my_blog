package com.xuxin.controller;

import com.xuxin.model.User;
import com.xuxin.service.IUserService;
import com.xuxin.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
