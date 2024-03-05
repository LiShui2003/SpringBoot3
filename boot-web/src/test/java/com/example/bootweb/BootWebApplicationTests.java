package com.example.bootweb;

import com.example.bootweb.service.HelloService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class BootWebApplicationTests {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    void redisTest(){
        redisTemplate.opsForValue().set("a","1234");
    }

}
