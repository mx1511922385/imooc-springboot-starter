package com.imooc.imoocspringbootstarter.UserController;

import com.imooc.imoocspringbootstarter.pojo.Area;
import com.imooc.imoocspringbootstarter.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Tests")
public class TestController {
    @Autowired
    private AreaService areaService;
      @RequestMapping("/test")
    public void insert() {
          Area area = new Area();
          area.setAreaId(8);
          area.setAreaName("美丽");
          area.setPriority(3);
          area.setCreatTime(new Date());
          area.setLastEditTime(new Date());
          areaService.insert(area);
      }

      @RequestMapping("/page")
      public List<Area> queryAreaPaged(Integer page) {
          if(page == null) {
              page = 1;
          }
          int pageSize = 3;
          Area area = new Area();
          List<Area> areaList = areaService.queryAreaListPaged(area,page,pageSize);
          return areaList;
      }
}
