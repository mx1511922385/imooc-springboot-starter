package com.imooc.imoocspringbootstarter.UserController;

import com.imooc.imoocspringbootstarter.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources")
public class helloController {
    @Autowired
    private Resource resource;
    @RequestMapping("/resource")
    public Resource getResource() {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        return bean;

    }


}
