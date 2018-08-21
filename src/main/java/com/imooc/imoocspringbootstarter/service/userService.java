package com.imooc.imoocspringbootstarter.service;

import com.imooc.imoocspringbootstarter.dao.Mapper;
import com.imooc.imoocspringbootstarter.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class userService implements userServices{
    @Autowired
    private Mapper mapper;

    @Override
    public User getAreaById(int id) {
        return mapper.selectUser(id);
    }
}
