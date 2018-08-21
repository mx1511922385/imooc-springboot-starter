package com.imooc.imoocspringbootstarter.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @RequestMapping("/test")
    public String test() {
        stringRedisTemplate.opsForValue().set("imooc-cache","helle 木渴望");
        return stringRedisTemplate.opsForValue().get("imooc-cache");
    }

}
