package com.xuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/T2")
public class ControllerTest3 {
    @RequestMapping("t1")
    public String test1(Model model){
        model.addAttribute("msg","hello t2");
        return "test";
    }
}
