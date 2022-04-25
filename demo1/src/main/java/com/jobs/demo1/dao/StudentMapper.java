package com.jobs.demo1.dao;

import com.jobs.demo1.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Tim_Shu
 * @create 2022-04-13-9:16
 */
public interface StudentMapper {
    List<Student> selectTitleByLike(@Param("title") String title);

    List<Student> selectAreaByLike(@Param("area")String area);

    int insertRecord(Student record);
}
