package com.jobs.demo1;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jobs.demo1.bean.Job;
import com.jobs.demo1.bean.JobExample;
import com.jobs.demo1.bean.Student;
import com.jobs.demo1.dao.JobMapper;
import com.jobs.demo1.dao.StudentMapper;
import com.jobs.demo1.dao.UserMapper;
import com.jobs.demo1.service.JobService;
import com.jobs.demo1.service.RecommendService;
import com.jobs.demo1.utils.JiebaUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    JobMapper jobMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    UserMapper mapper;

    @Autowired
    JobService jobService;

    @Autowired
    RecommendService recommendService;
    @Autowired
    SqlSession sqlSession;

//    @Test
//    void jpython(){
//        Properties props = new Properties();
//        props.put("python.home", "path to the Lib folder");
//        props.put("python.console.encoding", "UTF-8");
//        props.put("python.security.respectJavaAccessibility", "false");
//        props.put("python.import.site", "false");
//        Properties preprops = System.getProperties();
//        PythonInterpreter.initialize(preprops, props, new String[0]);
//
//        PythonInterpreter PythonExecTool = new PythonInterpreter();
//        System.out.println( "Hello World!" );
//        PythonExecTool.execfile("E:\\data\\1039646854\\FileRecv\\07-标题相似度检测与聚类\\论文主题相似度检测.py");
//
//    }

    @Test
    void testGetMapper() throws IOException {
//        String commend = "cmd.exe /c cd"+ "E:\\data\\1039646854\\FileRecv\\07-标题相似度检测与聚类"+ "&& start python 论文主题相似度检测.py ";
//        String args = "D:\\python";
//        String[] commend=new String[] {"python","E:\\data\\1039646854\\FileRecv\\07-标题相似度检测与聚类\\check.py","java开发"};
//        Process proc = Runtime.getRuntime().exec(commend);
////        InputStreamReader inputStreamReader = new InputStreamReader(proc.getInputStream());
////
////        LineNumberReader lineNumberReader = new LineNumberReader(inputStreamReader);
////
////        result = lineNumberReader.readLine();
//        BufferedReader in=new BufferedReader(new InputStreamReader(proc.getInputStream(),"utf-8"));
//        String line;
//        while ((line=in.readLine()) !=null){
//            System.out.println(line);
//        }
//        proc.waitFor();
        ArrayList s = recommendService.giveRecommend("C++北京");
        System.out.println(s);

    }

    @Test
    void contextLoads() throws IOException {
//        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
//        JobMapper mapper=sqlSession.getMapper(JobMapper.class);
//        System.out.println(mapper.countByExp("python", "3"));
//        System.out.println(mapper.selectTitleByTitleAndAreaAndCname("java开发", "西安", "西安"));
//        String value="123456";
//        String s = DigestUtils.md5DigestAsHex(value.getBytes(StandardCharsets.UTF_8));
//        System.out.println(s);

        JiebaUtils jiebaUtils= new JiebaUtils();
        jiebaUtils.test();
//
//        jiebaUtils.test("针对springboot的CSV导入clickhouse;批量导入数据库这个问题,很多小白还是比较困扰,现在这篇文章举例源码做了详细说明,还不懂的朋友可以了解一下。 上传CSV文件.");

//        Student student=new Student();
//        student.setTitle("java");
//        student.setArea("西安");
//        mapper.insertRecord(student);
//        System.out.println(mapper.selectPassword("1602820101"));
        //        JobExample jobExample=new JobExample();
//        JobExample.Criteria criteria=jobExample.createCriteria();
//        criteria.andTitleLike("%Java%");
//        criteria.andSalaryLike("%1%");


//        System.out.println(jobService.selectTitleByTitleAreaAndExp("java","北京","1"));
//        System.out.println(jobMapper.selectTitleByLike("游戏策划"));
//        System.out.println(jobMapper.selectSalaryByTitle("java"));
//        System.out.println(jobMapper.selectTitleByTitleAndArea("java","西安"));

//        PageHelper.startPage(3,5);
//        String a="java";
//        String b="西安";
//        List<Job> java = jobService.selectTitleByTitleAndArea(a,b);
//        java.forEach(jobs -> System.out.println(jobs));
//
//        PageInfo info=new PageInfo(java,5);

//        System.out.println(jobService.countByTitle(""));


//        list.forEach(jobs -> System.out.println((String) jobs));
//        java.forEach(jobs -> System.out.println(jobs));
//        PageInfo page=new PageInfo(list,5);
//        System.out.println(list);
    }

}
