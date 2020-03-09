package com.cn.wanxi.entity;
/**
 * @Author lld
 * @Description //TODO lld
 * @Date 16:55 2020/3/5
 * @Param 
 * @return  
 * @Version 1.0
 **/
public class TeacherAppointTitleEntity {
    private Integer id;
    private String subject;
    private String test_title;
    private String test_answer;
    private String title_model;
    private String grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTest_title() {
        return test_title;
    }

    public void setTest_title(String test_title) {
        this.test_title = test_title;
    }

    public String getTest_answer() {
        return test_answer;
    }

    public void setTest_answer(String test_answer) {
        this.test_answer = test_answer;
    }

    public String getTitle_model() {
        return title_model;
    }

    public void setTitle_model(String title_model) {
        this.title_model = title_model;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
