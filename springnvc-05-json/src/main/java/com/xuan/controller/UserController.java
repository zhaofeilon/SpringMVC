package com.xuan.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xuan.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody//不走视图解析器
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user=new User("朱标" ,23,"nan");
        String str = mapper.writeValueAsString(user);

        return  str;
    }
    @ResponseBody
    @RequestMapping("j2")
    public String json2() throws JsonProcessingException {
//        ObjectMapper map = new ObjectMapper();
        List<User> users = new ArrayList<User>();
        User user1 = new User("朱标", 23, "男");
        User user2 = new User("刘浩", 22, "男");
        User user3 = new User("刘璋", 24, "男");
        User user4 = new User("李彪", 27, "男");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
//          String str=map.writeValueAsString(users);
//          return str；
        return JSON.toJSONString(users);//阿里的fastjson方法


    }
}
