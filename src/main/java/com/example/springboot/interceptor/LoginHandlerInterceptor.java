package com.example.springboot.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/***
 * 登录拦截器
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    //调用目标方法之前拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if(loginUser != null){
            return  true;
        }

        //没有登录
        request.setAttribute("msg","没有权限，请先登录！");
        request.getRequestDispatcher("/index.html").forward(request,response);
        return false;
    }
}
