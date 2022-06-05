package com.xuxin.controller;

import com.xuxin.model.Menu;
import com.xuxin.service.IMenuService;
import com.xuxin.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private IMenuService menuService;

    /**
     * 查询所有菜单
     * @return
     */
    @GetMapping("/getAllMenus")
    public Result getAllMenus() {
        try {
            List<Menu> menus = menuService.getAllMenus();
            return Result.success(menus);
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 查询单个菜单
     * @param id
     * @return
     */
    @GetMapping("/getMenuById")
    public Result getMenuById(int id) {
        try {
            Menu menu = menuService.getMenuById(id);
            return Result.success(menu);
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 添加菜单
     * @param menu
     * @return
     */
    @PostMapping("/addMenu")
    public Result addMenu(Menu menu) {
        try {
            menuService.addMenu(menu);
            return Result.success();
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 删除菜单
     * @param id
     * @return
     */
    @DeleteMapping("/deleteMenuById")
    public Result deleteMenuById(int id) {
        try {
            menuService.deleteMenuById(id);
            return Result.success();
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 批量删除菜单
     * @param ids
     * @return
     */
    @DeleteMapping("/deleteMenuByIds")
    public Result deleteMenuByIds(int[] ids) {
        try {
            menuService.deleteMenuByIds(ids);
            return Result.success();
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }

    /**
     * 修改菜单
     * @param menu
     * @return
     */
    @PostMapping("/updateMenu")
    public Result updateMenu(Menu menu) {
        try {
            menuService.updateMenu(menu);
            return Result.success();
        } catch (Exception e) {
            return Result.failed(e.getMessage());
        }
    }
}
