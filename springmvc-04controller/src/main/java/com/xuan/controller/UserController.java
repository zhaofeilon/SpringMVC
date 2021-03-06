package com.xuan.controller;

import com.xuan.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/U1")
public class UserController {
    @GetMapping("/t1")
    public String test1(User user, Model model){
        System.out.println(user);
        model.addAttribute("msg",user);
        return "test";
    }

}
