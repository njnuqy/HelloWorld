package com.test.intercepter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        System.out.println(request.getRequestURI());
        String url = request.getRequestURI();
        if(url.contains("/login")){
            return true;
        }
        Object user = request.getSession().getAttribute("user");
        System.out.println(user);
        if(user == null){
            response.sendRedirect("/login");
            return false;
        }
        return true;
    }

}
