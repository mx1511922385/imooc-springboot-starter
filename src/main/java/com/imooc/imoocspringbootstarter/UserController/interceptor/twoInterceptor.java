package com.imooc.imoocspringbootstarter.UserController.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class twoInterceptor implements HandlerInterceptor {
    /*
    *在请求处理之前调用(Controller方法之前调用)
    * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("被one拦截，不放行...");
        //return true;
        return false;  //拦截，不放行

    }


    /*
    * 请求处理之前调用，但是在试图渲染之前（Controller方法之前）
    * */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    /*
    * 在请求结束之后调用，也就是在dispacherServlet 渲染了对应的视图之后执行
    * （主要用于进行资源清理工作）
    * */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }


}

