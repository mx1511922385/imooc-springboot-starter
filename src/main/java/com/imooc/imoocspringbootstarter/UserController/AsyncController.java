package com.imooc.imoocspringbootstarter.UserController;

import com.imooc.imoocspringbootstarter.Tesks.AsnycTask;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@Api(tags={"Permission"},description = "null")
@RestController
@RequestMapping("/resources")
public class AsyncController {
    @Autowired
    private AsnycTask async;

    @ApiOperation(value="test",notes="test")
    @RequestMapping("test1")
    public String test1() throws Exception {
        long start =System.currentTimeMillis();
        Future<Boolean> a = async.doTask11();
        Future<Boolean> b = async.doTask22();
        Future<Boolean> c = async.doTask33();
        Future<Boolean> d = async.doTask44();
        while (!a.isDone() || !b.isDone()||!c.isDone()||!d.isDone()){
            if(a.isDone()&&b.isDone()&&c.isDone()&&d.isDone()){
                break;
            }

        }
        long end = System.currentTimeMillis();
        String times ="任务全部完成，总耗时："+(end - start) + "毫秒";
        return times;

    }


}
