package com.xuxin.mapper;

import com.xuxin.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

//    @Select("select * from users")
    List<User> getAllUsers();
}
