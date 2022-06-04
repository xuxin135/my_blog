package com.xuxin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class PageController {

    @GetMapping("/{page}")
    public String getPage(@PathVariable(value = "page") String page) {
        return page;
    }
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }


}
