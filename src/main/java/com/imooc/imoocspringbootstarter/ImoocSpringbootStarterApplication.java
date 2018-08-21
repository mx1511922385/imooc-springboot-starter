package com.imooc.imoocspringbootstarter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//扫描Mybatis Mapper包路径
@MapperScan("com.imooc.imoocspringbootstarter.dao")
//扫描所有需要的包
@ComponentScan(basePackages = "com.imooc")
//开启定时任务
//@EnableScheduling
//开启异步任务
@EnableAsync
public class ImoocSpringbootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImoocSpringbootStarterApplication.class, args);
	}
}
