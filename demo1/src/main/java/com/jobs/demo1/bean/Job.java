
package com.jobs.demo1.bean;

import lombok.Data;
@Data
public class Job {
    private Integer id;

    private String title;

    private String href;

    private String cName;

    private String salary;

    private String area;

    private String exp;

    private String edu;

    //    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title == null ? null : title.trim();
//    }
//
//    public String getHref() {
//        return href;
//    }
//
//    public void setHref(String href) {
//        this.href = href == null ? null : href.trim();
//    }
//
//    public String getcName() {
//        return cName;
//    }
//
//    public void setcName(String cName) {
//        this.cName = cName == null ? null : cName.trim();
//    }
//
//    public String getSalary() {
//        return salary;
//    }
//
//    public void setSalary(String salary) {
//        this.salary = salary == null ? null : salary.trim();
//    }
//
//    public String getArea() {
//        return area;
//    }
//
//    public void setArea(String area) {
//        this.area = area == null ? null : area.trim();
//    }
//
//    public String getExp() {
//        return exp;
//    }
//
//    public void setExp(String exp) {
//        this.exp = exp == null ? null : exp.trim();
//    }
//
//    public String getEdu() {
//        return edu;
//    }
//
//    public void setEdu(String edu) {
//        this.edu = edu == null ? null : edu.trim();
//    }
}