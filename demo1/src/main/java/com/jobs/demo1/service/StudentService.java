package com.jobs.demo1.service;

import com.jobs.demo1.bean.Student;
import com.jobs.demo1.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Tim_Shu
 * @create 2022-04-13-10:17
 */
@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public void saveStudent(Student student){
        studentMapper.insertRecord(student);
    }
}
