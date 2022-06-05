package com.xuxin.service;

import com.xuxin.model.Menu;

import java.util.List;

public interface IMenuService {
    List<Menu> getAllMenus();
    Menu getMenuById(int id);
    void addMenu(Menu menu);
    void deleteMenuById(int id);
    void deleteMenuByIds(int[] ids);
    void updateMenu(Menu menu);

}
