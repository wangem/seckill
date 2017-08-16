package com.answern.seckill.core.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.answern.seckill.core.base.redis.RedisUtil;
import com.answern.seckill.core.demo.model.User;
  
 
 

@RestController  
@RequestMapping("/redis")  
public class RedisCacheController {  
      
    @Autowired  
    private RedisUtil redisUtil;  
  
    @RequestMapping("/test")  
    public String getSessionId() {  
        redisUtil.set("123", "测试ddd");  
        System.out.println("进入了方法");  
        String string = redisUtil.get("123", String.class);  
        
        return string;  
    }  
      
    @RequestMapping("/student")  
    public User getStudent() {  
        User user = new User();  
        user.setId("001");  
        user.setAge("17");  
        user.setName("张三");  
        redisUtil.set("001", user);  
        return (User) redisUtil.get("001",User.class);  
    }  
      
}