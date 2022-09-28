package com.fan.mybatisPlus.controller;

import com.fan.mybatisPlus.pojo.User;
import com.fan.mybatisPlus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> users = userService.getUsers();
        return users;
    }
}
