package com.imooc.imoocspringbootstarter.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/two")
public class twoController {
    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name","imooc11");
        return "index";

    }
    @RequestMapping("/center")
    public String center(ModelMap map) {
        map.addAttribute("name","imooc22");
        return "test";

    }
    @RequestMapping("/test")
    public String test(ModelMap map) {
        map.addAttribute("name","imooc33");
        return "test";

    }



}
