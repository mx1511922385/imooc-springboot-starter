package com.imooc.imoocspringbootstarter.dao;

import com.imooc.imoocspringbootstarter.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


//@Repository
public interface Mapper {
    //@Select("SELECT * FROM User where id=#{id}")
    User selectUser(int id);
}
