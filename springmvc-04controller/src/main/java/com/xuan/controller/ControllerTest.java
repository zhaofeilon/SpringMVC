package com.xuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {
    @RequestMapping("/test1")
    public String test(Model model){
        model.addAttribute("msg","ControllerTest");
        return "test";
    }
    @RequestMapping("/test2")
    public String test2(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test";
    }
    @RequestMapping("/test3")
    public String test3(Model model){
        model.addAttribute("msg","ControllerTest3");
        return "test";
    }
}
