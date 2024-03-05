package com.example.bootweb.controller;

import com.example.bootweb.bean.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/haha")
    public Person Hello() {
        return new Person(10L, "lishui", "2419773293@qq.com", 21);
    }
}
