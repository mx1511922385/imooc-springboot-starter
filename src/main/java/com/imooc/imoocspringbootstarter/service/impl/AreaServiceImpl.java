
package com.imooc.imoocspringbootstarter.service.impl;

import com.github.pagehelper.PageHelper;
import com.imooc.imoocspringbootstarter.dao.AreaMapper;
import com.imooc.imoocspringbootstarter.pojo.Area;
import com.imooc.imoocspringbootstarter.service.AreaService;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;
  @Override
  /*
  事务回滚
  * */
  @Transactional(propagation = Propagation.REQUIRED)
    public void insert(Area record) {

      //事务回滚不会执行插入语句，没有则会执行
       areaMapper.insert(record);
      //int a=1/0;


    }

    @Override
    public List<Area> queryAreaListPaged(Area area, Integer page, Integer pageSize){
        PageHelper.startPage(page,pageSize);
        Example example = new Example(Area.class);
        Example.Criteria criteria =example.createCriteria();
        if(!StringUtils.isEmptyOrWhitespaceOnly(area.getAreaName())) {
            criteria.andLike("AreaName", "%" + area.getAreaName() + "%");
        }
            example.orderBy("areaId").desc();

            List<Area> areaList = areaMapper.selectByExample(example);
            return areaList;

    }


}
