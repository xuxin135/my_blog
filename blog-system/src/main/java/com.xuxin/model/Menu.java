package com.xuxin.model;

public class Menu {
    private int id;
    private String menuname;
    private String path;

    public Menu() {
    }

    public Menu(int id, String menuname, String path) {
        this.id = id;
        this.menuname = menuname;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
