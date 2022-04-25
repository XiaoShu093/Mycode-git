package com.jobs.demo1.controller;

import com.jobs.demo1.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Tim_Shu
 * @create 2022-04-15-22:40
 */
@Controller
public class LoginController {
    @Autowired
    UserMapper mapper;
    @RequestMapping("/login")
    @ResponseBody
    public void login(HttpServletRequest servletRequest, HttpServletResponse response) throws ServletException, IOException {
        String userName = servletRequest.getParameter("username");
        String passWord = servletRequest.getParameter("password");

        String userPassword = mapper.selectPassword(userName);
        String s = DigestUtils.md5DigestAsHex(passWord.getBytes(StandardCharsets.UTF_8));
        if(s.equals(userPassword)){
            servletRequest.getSession().setAttribute("username","success");
            servletRequest.getRequestDispatcher("/index").forward(servletRequest,response);
        }else{
            servletRequest.setAttribute("msg","用户名或密码错误，登陆失败！");
            servletRequest.getRequestDispatcher("/").forward(servletRequest,response);
        }

//        System.out.println(userName+","+passWord);
    }

    @RequestMapping("/registPage")
    @ResponseBody
    public void regist(HttpServletRequest servletRequest, HttpServletResponse response) throws ServletException, IOException {

        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");
        String email = servletRequest.getParameter("email");

        if(username!=null && password!=null){
            String s = mapper.selectPassword(username);
            if(s == null){
                mapper.insertNameAndPassAndEmail(username,password,email);
                servletRequest.getRequestDispatcher("/").forward(servletRequest,response);
        }else {
                servletRequest.setAttribute("msg","用户名已存在，注册失败！");
                servletRequest.getRequestDispatcher("/regist").forward(servletRequest,response);
            }
        }
    }
}
