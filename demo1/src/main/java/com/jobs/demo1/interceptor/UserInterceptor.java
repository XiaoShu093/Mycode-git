package com.jobs.demo1.interceptor;

import com.jobs.demo1.bean.Users;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Tim_Shu
 * @create 2022-04-16-16:07
 */
public class UserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object username = request.getSession().getAttribute("username");
        if (null == username){
            request.getRequestDispatcher("/errorPage").forward(request,response);
            return false;
        }else{
        return true;
        }
    }
}
