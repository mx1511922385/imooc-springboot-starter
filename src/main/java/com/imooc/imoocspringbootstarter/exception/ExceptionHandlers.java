package com.imooc.imoocspringbootstarter.exception;



        import org.springframework.web.bind.annotation.ControllerAdvice;
        import org.springframework.web.servlet.ModelAndView;
        import org.springframework.web.bind.annotation.ExceptionHandler;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;

@ControllerAdvice  //页面跳转捕获异常
public class ExceptionHandlers {

    public static final String IMOOC_ERROR_VIEW = "err";

    @ExceptionHandler(value = Exception.class)
    public Object errHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception{
        e.printStackTrace();
        ModelAndView mav =new ModelAndView();
        mav.addObject("exception",e);
        mav.addObject("url",request.getRequestURL());
        mav.setViewName(IMOOC_ERROR_VIEW);
        return mav;
    }


}
