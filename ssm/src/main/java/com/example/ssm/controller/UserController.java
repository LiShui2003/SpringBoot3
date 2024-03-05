package com.example.ssm.controller;

import com.example.ssm.bean.User;
import com.example.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userMapper.getUserById(id);
    }
}
