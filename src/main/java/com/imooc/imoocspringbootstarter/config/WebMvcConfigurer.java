package com.imooc.imoocspringbootstarter.config;

import com.imooc.imoocspringbootstarter.UserController.interceptor.oneIntercepter;
import com.imooc.imoocspringbootstarter.UserController.interceptor.twoInterceptor;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Intercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/*
* 拦截器配置
* */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport{

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        /*
        *拦截器按照顺序执行
        * */
        registry.addInterceptor(new oneIntercepter()).addPathPatterns("/one/**");
        registry.addInterceptor(new twoInterceptor()).addPathPatterns("/two/**");
        super.addInterceptors(registry);
    }

}
