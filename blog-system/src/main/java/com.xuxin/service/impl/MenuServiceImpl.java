package com.xuxin.service.impl;

import com.xuxin.mapper.MenuMapper;
import com.xuxin.model.Menu;
import com.xuxin.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

    @Override
    public Menu getMenuById(int id) {
        return menuMapper.getMenuById(id);
    }

    @Override
    public void addMenu(Menu menu) {
        menuMapper.addMenu(menu);
    }

    @Override
    public void deleteMenuById(int id) {
        menuMapper.deleteMenuById(id);
    }

    @Override
    public void deleteMenuByIds(int[] ids) {
        menuMapper.deleteMenuByIds(ids);
    }

    @Override
    public void updateMenu(Menu menu) {
        menuMapper.updateMenu(menu);
    }
}
