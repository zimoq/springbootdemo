package com.ahead.controller;

import com.ahead.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/show")
    public String show(Model model){
        model.addAttribute("user","李四");
        return "index";
    }

    @RequestMapping("/Demo")
    public String Demo(Model model){
        model.addAttribute("ok","成功");
        return "demo";
    }

    @RequestMapping("/jdbc")
    public String Jdbc(){
        userDao.getUser();
        return "demo";
    }
}
