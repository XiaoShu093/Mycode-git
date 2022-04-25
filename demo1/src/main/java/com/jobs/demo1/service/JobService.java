package com.jobs.demo1.service;

import com.jobs.demo1.bean.Job;
import com.jobs.demo1.bean.JobExample;
import com.jobs.demo1.dao.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tim_Shu
 * @create 2022-03-29-10:33
 */
@Service
public class JobService {
    @Autowired
      JobMapper jobMapper;

//    public Job getName(Integer id){
//        Job job=jobMapper.selectByPrimaryKey(id);
//        return  job;
//    }
//按照工作类型查找所有属性
    public void selectBatchByTitle(String values){
        JobExample jobExample=new JobExample();
        JobExample.Criteria criteria=jobExample.createCriteria();

        criteria.andTitleLike(values);

        jobMapper.selectByExample(jobExample);
    }
//按照公司名查找所有属性
    public void selectBatchByCName(String values){
        JobExample jobExample=new JobExample();
        JobExample.Criteria criteria=jobExample.createCriteria();

        criteria.andCNameLike(values);
        jobMapper.selectByExample(jobExample);
    }
//按照工资标准查找所有属性
    public void selectBatchBySalary(String values){
        JobExample jobExample=new JobExample();
        JobExample.Criteria criteria=jobExample.createCriteria();

        criteria.andSalaryLike(values);

        jobMapper.selectByExample(jobExample);
    }
//按照工资地域查找所有属性
    public void selectBatchByArea(String values){
        JobExample jobExample=new JobExample();
        JobExample.Criteria criteria=jobExample.createCriteria();

        criteria.andAreaLike(values);

        jobMapper.selectByExample(jobExample);
    }

//    按照公司所在地以及行业属性查找所有属性
    public void selectBatchByAreaAndTitle(String a,String b){
        JobExample jobExample=new JobExample();
        JobExample.Criteria criteria=jobExample.createCriteria();

        criteria.andAreaLike(a);
        criteria.andAreaLike(b);

        jobMapper.selectByExample(jobExample);
    }
//按照经验以及行业属性查找所有属性
    public void selectBatchBysalaryAndTitle(String a,String b){
        JobExample jobExample=new JobExample();
        JobExample.Criteria criteria=jobExample.createCriteria();

        criteria.andExpLike(a);
        criteria.andTitleLike(b);

        jobMapper.selectByExample(jobExample);
    }
// 按照职业查找个别字段
    public List<Job> selectTitleByLike(String title){
       return jobMapper.selectTitleByLike(title);
    }
//    按照地域查询个别字段（职位、公司、薪资水平）
    public List<Job> selectAreaByLike(String area){
        return jobMapper.selectAreaByLike(area);
    }
//    按照职位查询薪水
    public List<Job> selectSalaryByTitle(String title){
        return jobMapper.selectSalaryByTitle(title);
    }
//    按照职位和地域查询个别字段
    public List<Job> selectTitleByTitleAndArea(String title,String area ){
        return jobMapper.selectTitleByTitleAndArea(title,area);
    }
    public List<Job> selectTitleByTitleAndAreaAndCname(String title,String area,String cname ){
        return jobMapper.selectTitleByTitleAndAreaAndCname(title,area,cname);
    }
//    查询个别字段依据地域经验等
    public List<Job> selectTitleByTitleAreaAndExp(String title,String area,String exp ){
        return jobMapper.selectTitleByTitleAreaAndExp(title,area,exp);
    }
//    查询某个职位提供的岗位数
    public int countByTitle(String title){
        return jobMapper.countByTitle(title);
    }

//    查询某类开发工作对工作经验要求
    public int countByExp(String title,String exp){return jobMapper.countByExp(title,exp);}
//    查询岗位数根据地域和职位
    public int countByTitleAndArea(String title,String area){
        return jobMapper.countByTitleAndArea(title,area);
    }

}
