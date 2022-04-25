package com.jobs.demo1.service;

import com.jobs.demo1.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Tim_Shu
 * @create 2022-04-15-22:58
 */
@Service
public class UserService {
    @Autowired
    UserMapper mapper;
    public void getPassword(String username){
        mapper.selectPassword(username);
    }
    public void insertInfo(String username,String password,String email){
        mapper.insertNameAndPassAndEmail(username,password,email);
    }

}
