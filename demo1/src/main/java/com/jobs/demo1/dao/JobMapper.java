package com.jobs.demo1.dao;

import com.jobs.demo1.bean.Job;
import com.jobs.demo1.bean.JobExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    int countByExample(JobExample example);

    int countByTitle(@Param("title")String title);

    int countByTitleAndArea(@Param("title")String title,@Param("area")String area);

    int countByExp(@Param("title")String title,@Param("exp")String exp);

    int deleteByExample(JobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByExample(JobExample example);

    List<Job> selectTitleByLike(@Param("title")String title);

    List<Job> selectAreaByLike(@Param("area")String area);

    List<Job> selectSalaryByTitle(@Param("title")String title);

    List<Job> selectTitleByTitleAndArea(@Param("title")String title,@Param("area") String area);

    List<Job> selectTitleByTitleAndAreaAndCname(@Param("title")String title,@Param("area") String area,@Param("cname")String cname);

    List<Job> selectTitleByTitleAreaAndExp(@Param("title")String title,@Param("area") String area,@Param("exp")String exp);

    Job selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}