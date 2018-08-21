package com.imooc.imoocspringbootstarter.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/err")
public class errController {
    @RequestMapping("/err")
    public String getErr() {
       int a = 1/0;
       return "err";
    }

}
