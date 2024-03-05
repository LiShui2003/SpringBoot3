package com.example.boot02.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/haha")
    public String haha() {
        String a = "lishui";
        String b = "lihua";

        log.info("info ... ");
        log.warn("warn ... a:{}, b:{}", a, b);
        log.error("error ...");

        return "haha";
    }
}
