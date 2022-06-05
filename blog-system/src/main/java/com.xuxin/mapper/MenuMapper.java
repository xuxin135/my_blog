package com.xuxin.mapper;

import com.xuxin.model.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getAllMenus();
    Menu getMenuById(int id);
    void addMenu(Menu menu);
    void deleteMenuById(int id);
    void deleteMenuByIds(int[] ids);
    void updateMenu(Menu menu);
}
