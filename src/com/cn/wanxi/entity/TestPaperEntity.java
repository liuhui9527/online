package com.cn.wanxi.entity;

import java.util.Date;
/**
 * @Author lld
 * @Description //TODO lld
 * @Date 17:01 2020/3/5
 * @Param 
 * @return  
 * @Version 1.0
 **/

public class TestPaperEntity {
    private int id;
    private String test_name;
    private String test_subject;
    private int grade;
    private int sum_gader;
    private int choose_gader;
    private int completion_gader;
    private int recognized_gader;
    private String paper_rollOfPeople;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public String getTest_subject() {
        return test_subject;
    }

    public void setTest_subject(String test_subject) {
        this.test_subject = test_subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSum_gader() {
        return sum_gader;
    }

    public void setSum_gader(int sum_gader) {
        this.sum_gader = sum_gader;
    }

    public int getChoose_gader() {
        return choose_gader;
    }

    public void setChoose_gader(int choose_gader) {
        this.choose_gader = choose_gader;
    }

    public int getCompletion_gader() {
        return completion_gader;
    }

    public void setCompletion_gader(int completion_gader) {
        this.completion_gader = completion_gader;
    }

    public int getRecognized_gader() {
        return recognized_gader;
    }

    public void setRecognized_gader(int recognized_gader) {
        this.recognized_gader = recognized_gader;
    }

    public String getPaper_rollOfPeople() {
        return paper_rollOfPeople;
    }

    public void setPaper_rollOfPeople(String paper_rollOfPeople) {
        this.paper_rollOfPeople = paper_rollOfPeople;
    }
}