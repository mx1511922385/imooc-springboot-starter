package com.imooc.imoocspringbootstarter.UserController;

import com.imooc.imoocspringbootstarter.pojo.User;
import com.imooc.imoocspringbootstarter.service.userService;
import com.imooc.imoocspringbootstarter.service.userServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private userService userservices;

    @RequestMapping("/hello/{id}")
    public User selectUser(@PathVariable int id) {
        return userservices.getAreaById(id);
    }

    @RequestMapping("/hello")
    public User getUser() {
        User u =new User();
        u.setAge(12);
        u.setId(1);
        u.setName("张三");
        return u;
    }
}
