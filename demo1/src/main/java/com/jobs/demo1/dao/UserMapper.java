package com.jobs.demo1.dao;

import org.apache.ibatis.annotations.Param;


/**
 * @author Tim_Shu
 * @create 2022-04-15-22:54
 */
public interface UserMapper {
    String selectPassword(@Param("username") String username);
    int insertNameAndPassAndEmail(@Param("username")String username,@Param("password") String password,@Param("email")String email);
}
