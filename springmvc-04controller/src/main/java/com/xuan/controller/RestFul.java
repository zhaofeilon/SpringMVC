package com.xuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFul {
    @RequestMapping("/H1/{a}/{b}")
    public String test(@PathVariable int a, @PathVariable int b, Model model){
        int c=a+b;
        model.addAttribute("msg","result :"+c);
        return "restful";
    }
}
