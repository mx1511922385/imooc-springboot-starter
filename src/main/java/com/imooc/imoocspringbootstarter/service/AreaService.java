package com.imooc.imoocspringbootstarter.service;

import com.imooc.imoocspringbootstarter.pojo.Area;

import java.util.List;

public interface AreaService {
    void insert(Area record);
    List<Area> queryAreaListPaged(Area area, Integer page, Integer pageSize);

}
