package com.jobs.demo1.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jobs.demo1.bean.Job;
import com.jobs.demo1.bean.Msg;
import com.jobs.demo1.bean.Student;
import com.jobs.demo1.service.JobService;
import com.jobs.demo1.service.RecommendService;
import com.jobs.demo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.*;

/**
 * @author Tim_Shu
 * @create 2022-03-30-9:42
 */
@Controller
public class JobController {

    //    自动注入
    @Autowired
    JobService jobService;
    @Autowired
    StudentService studentService;
    @Autowired
    RecommendService recommendService;
    //    根映射
    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @RequestMapping("/regist")
    public String regist(){return "regist";}

    @RequestMapping("/errorPage")
    public String error(){return "error";}

    @RequestMapping("/index")
    public String index(){return "index";}
    //echarts数据图标的数据请求
    @GetMapping(value = "/countData")
    @ResponseBody
    public Map countData() {
        Map<String,ArrayList> map=new HashMap<>();
        int count = jobService.countByTitle("后端开发");
        int count1 = jobService.countByTitle("前端");
        int count2 = jobService.countByTitle("大数据");
        int count3 = jobService.countByTitle("人工智能");
        int count4 = jobService.countByTitle("移动开发");
        int count5 = jobService.countByTitle("测试");

        ArrayList<Integer> result=new ArrayList<>();

        ArrayList<Integer> resultDetail=new ArrayList<>();

        int countDetail1 = jobService.countByTitle("c/c++");
        int countDetail2 = jobService.countByTitle("java");
        int countDetail3 = jobService.countByTitle("python");
        int countDetail4 = jobService.countByTitle("go");
        int countDetail5 = jobService.countByTitle("php");

        ArrayList<Integer> resultByAreaBei=new ArrayList<>();

        ArrayList<Integer> resultByAreaShang=new ArrayList<>();

        int countTitleByArea = jobService.countByTitleAndArea("开发","北京");
        int countTitleByArea1 = jobService.countByTitleAndArea("房地产","北京");
        int countTitleByArea2 = jobService.countByTitleAndArea("市场","北京");
        int countTitleByArea3= jobService.countByTitleAndArea("人事","北京");
        int countTitleByArea4 = jobService.countByTitleAndArea("销售","北京");
        int countTitleByArea5 = jobService.countByTitleAndArea("金融","北京");
        int countTitleByArea6 = jobService.countByTitleAndArea("开发","上海");
        int countTitleByArea7 = jobService.countByTitleAndArea("房地产","上海");
        int countTitleByArea8 = jobService.countByTitleAndArea("市场","上海");
        int countTitleByArea9= jobService.countByTitleAndArea("人事","上海");
        int countTitleByArea10 = jobService.countByTitleAndArea("销售","上海");
        int countTitleByArea11= jobService.countByTitleAndArea("金融","上海");

        ArrayList<Integer> resultByAreaHangZ=new ArrayList<>();
        int countTitleByAreaHangZ = jobService.countByTitleAndArea("开发","杭州");
        int countTitleByAreaHangZ1 = jobService.countByTitleAndArea("房地产","杭州");
        int countTitleByAreaHangZ2 = jobService.countByTitleAndArea("市场","杭州");
        int countTitleByAreaHangZ3 = jobService.countByTitleAndArea("人事","杭州");
        int countTitleByAreaHangZ4 = jobService.countByTitleAndArea("销售","杭州");
        int countTitleByAreaHangZ5 = jobService.countByTitleAndArea("金融","杭州");

        ArrayList<Integer> resultByAreaXian=new ArrayList<>();
        int countTitleByAreaXian = jobService.countByTitleAndArea("开发","西安");
        int countTitleByAreaXian1 = jobService.countByTitleAndArea("房地产","西安");
        int countTitleByAreaXian2 = jobService.countByTitleAndArea("市场","西安");
        int countTitleByAreaXian3 = jobService.countByTitleAndArea("人事","西安");
        int countTitleByAreaXian4 = jobService.countByTitleAndArea("销售","西安");
        int countTitleByAreaXian5 = jobService.countByTitleAndArea("金融","西安");

        ArrayList<Integer> resultByAreaChengD=new ArrayList<>();

        int countTitleByAreaChengD = jobService.countByTitleAndArea("开发","成都");
        int countTitleByAreaChengD1 = jobService.countByTitleAndArea("房地产","成都");
        int countTitleByAreaChengD2 = jobService.countByTitleAndArea("市场","成都");
        int countTitleByAreaChengD3 = jobService.countByTitleAndArea("人事","成都");
        int countTitleByAreaChengD4 = jobService.countByTitleAndArea("销售","成都");
        int countTitleByAreaChengD5 = jobService.countByTitleAndArea("金融","成都");

        ArrayList<Integer> resultByAreaWuHan=new ArrayList<>();

        int countTitleByAreaWuHan = jobService.countByTitleAndArea("开发","武汉");
        int countTitleByAreaWuHan1 = jobService.countByTitleAndArea("房地产","武汉");
        int countTitleByAreaWuHan2 = jobService.countByTitleAndArea("市场","武汉");
        int countTitleByAreaWuHan3 = jobService.countByTitleAndArea("人事","武汉");
        int countTitleByAreaWuHan4 = jobService.countByTitleAndArea("销售","武汉");
        int countTitleByAreaWuHan5 = jobService.countByTitleAndArea("金融","武汉");

        ArrayList<Integer> resultByExp = new ArrayList<>();

        int countByJavaExp = jobService.countByExp("java","5");
        int countByCExp = jobService.countByExp("C语言","5");
        int countByPythonExp = jobService.countByExp("Python","5");
        int countByTestExp = jobService.countByExp("测试","5");
        int countBySuanFaExp = jobService.countByExp("算法","5");

        result.add(count);
        result.add(count1);
        result.add(count2);
        result.add(count3);
        result.add(count4);
        result.add(count5);

        resultDetail.add(countDetail1);
        resultDetail.add(countDetail2);
        resultDetail.add(countDetail3);
        resultDetail.add(countDetail4);
        resultDetail.add(countDetail5);

        resultByAreaBei.add(countTitleByArea);
        resultByAreaBei.add(countTitleByArea1);
        resultByAreaBei.add(countTitleByArea2);
        resultByAreaBei.add(countTitleByArea3);
        resultByAreaBei.add(countTitleByArea4);
        resultByAreaBei.add(countTitleByArea5);

        resultByAreaShang.add(countTitleByArea6);
        resultByAreaShang.add(countTitleByArea7);
        resultByAreaShang.add(countTitleByArea8);
        resultByAreaShang.add(countTitleByArea9);
        resultByAreaShang.add(countTitleByArea10);
        resultByAreaShang.add(countTitleByArea11);

        resultByAreaHangZ.add(countTitleByAreaHangZ);
        resultByAreaHangZ.add(countTitleByAreaHangZ1);
        resultByAreaHangZ.add(countTitleByAreaHangZ2);
        resultByAreaHangZ.add(countTitleByAreaHangZ3);
        resultByAreaHangZ.add(countTitleByAreaHangZ4);
        resultByAreaHangZ.add(countTitleByAreaHangZ5);

        resultByAreaXian.add(countTitleByAreaXian);
        resultByAreaXian.add(countTitleByAreaXian1);
        resultByAreaXian.add(countTitleByAreaXian2);
        resultByAreaXian.add(countTitleByAreaXian3);
        resultByAreaXian.add(countTitleByAreaXian4);
        resultByAreaXian.add(countTitleByAreaXian5);

        resultByAreaChengD.add(countTitleByAreaChengD);
        resultByAreaChengD.add(countTitleByAreaChengD1);
        resultByAreaChengD.add(countTitleByAreaChengD2);
        resultByAreaChengD.add(countTitleByAreaChengD3);
        resultByAreaChengD.add(countTitleByAreaChengD4);
        resultByAreaChengD.add(countTitleByAreaChengD5);

        resultByAreaWuHan.add(countTitleByAreaWuHan);
        resultByAreaWuHan.add(countTitleByAreaWuHan1);
        resultByAreaWuHan.add(countTitleByAreaWuHan2);
        resultByAreaWuHan.add(countTitleByAreaWuHan3);
        resultByAreaWuHan.add(countTitleByAreaWuHan4);
        resultByAreaWuHan.add(countTitleByAreaWuHan5);

        resultByExp.add(countByJavaExp);
        resultByExp.add(countByCExp);
        resultByExp.add(countByPythonExp);
        resultByExp.add(countByTestExp);
        resultByExp.add(countBySuanFaExp);

        map.put("countKinds",result);
        map.put("countDetail",resultDetail);
        map.put("countByBei",resultByAreaBei);
        map.put("countByShang",resultByAreaShang);
        map.put("countAreaByHangZ",resultByAreaHangZ);
        map.put("countAreaByXian",resultByAreaXian);
        map.put("countAreaByChengD",resultByAreaChengD);
        map.put("countAreaByWuHan",resultByAreaWuHan);
        map.put("countByExp",resultByExp);

        return map;
    }
    // 查询列表页面
    @RequestMapping("/jobs")
    public String getJobs(){
        return "querylist";
    }
    // echarts数据请求页面
    @RequestMapping("/table")
    public String table(){
        return "analysis";
    }
    @RequestMapping("/test")
    public String test(){
        return "testPage";
    }
    @RequestMapping("/recommend")
    public String recommend(){
        return "recommendResult";
    }
    @RequestMapping("/form_demo")
    public String form(){return "recommendForm";}
    @RequestMapping("/details")
    public String details(){return "details";}
    @RequestMapping("/echarts")
    public String echarts(){return "echarts";}

    @RequestMapping("/jobsData")
    @ResponseBody
    public Msg getJobsWithJson(@RequestParam(value = "pn",defaultValue = "1")Integer pn, @RequestParam(value = "title",defaultValue = "java") String title, @RequestParam(value = "area",defaultValue = "北京") String area, @RequestParam(value = "edu",defaultValue = "1") String edu, Model model){

        PageHelper.startPage(pn,5);
        List<Job> list=jobService.selectTitleByTitleAreaAndExp(title, area, edu);
        PageInfo info=new PageInfo(list,5);
        return Msg.success().add("pageInfo",info);
    }
    @RequestMapping("/recommendDetails")
    @ResponseBody
    public Msg getJobsDetails(@RequestParam(value = "pn",defaultValue = "1")Integer pn, @RequestParam(value = "title") String title, @RequestParam(value = "area") String area, @RequestParam(value = "cname") String cname, Model model){

        PageHelper.startPage(pn,5);
        List<Job> list=jobService.selectTitleByTitleAndAreaAndCname(title, area, cname);
        PageInfo info=new PageInfo(list,5);
        return Msg.success().add("pageInfo",info);
    }
    @RequestMapping("/jobsRecommend")
    @ResponseBody
    public Msg getRecommend(@RequestParam(value = "pn",defaultValue = "1")Integer pn, @RequestParam(value = "title") String title, @RequestParam(value = "area") String area) throws IOException {
//        获取参数
        String text = title+area;
        System.out.println(text);
        ArrayList list = recommendService.giveRecommend(text);
//        System.out.println(s);
        return Msg.success().add("pageInfo",list);
    }
    @RequestMapping("/insertData")
    @ResponseBody
    public Msg getInsertData(@Validated Student student){
        studentService.saveStudent(student);
        return Msg.success();
    }
}
