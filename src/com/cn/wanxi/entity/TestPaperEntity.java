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
    private Integer     id;
    private String      test_name;
    private String      subject;
    private Integer     sum_gader;
    private String      test_start_time;
    private Integer     test_time;
    private Integer     choose_number;
    private Integer     choose_gader;
    private Integer     completion_number;
    private Integer     completion_gader;
    private Integer     recogized_number;
    private Integer     recogized_gader;
    private Integer     grade;
    private Integer     recongnized_rander_num;
    private Integer     completion_rander_num;
    private Integer     choose_rander_num;
    private Integer     sum_title_num;
    private Integer     choose_title_sd;
    private Integer     completion_title_sd;
    private Integer     recongnized_title_sd;


    public Integer getChoose_title_SD() {
        return choose_title_sd;
    }

    public void setChoose_title_SD(Integer choose_title_SD) {
        this.choose_title_sd = choose_title_SD;
    }

    public Integer getCompletion_title_SD() {
        return completion_title_sd;
    }

    public void setCompletion_title_SD(Integer completion_title_SD) {
        this.completion_title_sd = completion_title_SD;
    }

    public Integer getRecongnized_title_SD() {
        return recongnized_title_sd;
    }

    public Integer getChoose_title_sd() {
        return choose_title_sd;
    }

    public void setChoose_title_sd(Integer choose_title_sd) {
        this.choose_title_sd = choose_title_sd;
    }

    public Integer getCompletion_title_sd() {
        return completion_title_sd;
    }

    public void setCompletion_title_sd(Integer completion_title_sd) {
        this.completion_title_sd = completion_title_sd;
    }

    public Integer getRecongnized_title_sd() {
        return recongnized_title_sd;
    }

    public void setRecongnized_title_sd(Integer recongnized_title_sd) {
        this.recongnized_title_sd = recongnized_title_sd;
    }

    public void setRecongnized_title_SD(Integer recongnized_title_SD) {
        this.recongnized_title_sd = recongnized_title_SD;
    }

    public Integer getSum_title_num() {
        return sum_title_num;
    }

    public void setSum_title_num(Integer sum_title_num) {
        this.sum_title_num = sum_title_num;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getRecongnized_rander_num() {
        return recongnized_rander_num;
    }

    public void setRecongnized_rander_num(Integer recongnized_rander_num) {
        this.recongnized_rander_num = recongnized_rander_num;
    }

    public Integer getCompletion_rander_num() {
        return completion_rander_num;
    }

    public void setCompletion_rander_num(Integer completion_rander_num) {
        this.completion_rander_num = completion_rander_num;
    }

    public Integer getChoose_rander_num() {
        return choose_rander_num;
    }

    public void setChoose_rander_num(Integer choose_rander_num) {
        this.choose_rander_num = choose_rander_num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getSum_gader() {
        return sum_gader;
    }

    public void setSum_gader(Integer sum_gader) {
        this.sum_gader = sum_gader;
    }

    public String getTest_start_time() {
        return test_start_time;
    }

    public Integer getTest_time() {
        return test_time;
    }

    public void setTest_time(Integer test_time) {
        this.test_time = test_time;
    }

    public Integer getChoose_number() {
        return choose_number;
    }

    public void setChoose_number(Integer choose_number) {
        this.choose_number = choose_number;
    }

    public Integer getChoose_gader() {
        return choose_gader;
    }

    public void setChoose_gader(Integer choose_gader) {
        this.choose_gader = choose_gader;
    }

    public Integer getCompletion_number() {
        return completion_number;
    }

    public void setCompletion_number(Integer completion_number) {
        this.completion_number = completion_number;
    }

    public Integer getCompletion_gader() {
        return completion_gader;
    }

    public void setCompletion_gader(Integer completion_gader) {
        this.completion_gader = completion_gader;
    }

    public Integer getRecogized_number() {
        return recogized_number;
    }

    public void setRecogized_number(Integer recogized_number) {
        this.recogized_number = recogized_number;
    }

    public Integer getRecogized_gader() {
        return recogized_gader;
    }

    public void setRecogized_gader(Integer recogized_gader) {
        this.recogized_gader = recogized_gader;
    }

    @Override
    public String toString() {
        return "TestPaperEntity{" +
                "id=" + id +
                ", test_name='" + test_name + '\'' +
                ", subject='" + subject + '\'' +
                ", sum_gader=" + sum_gader +
                ", test_start_time=" + test_start_time +
                ", test_time=" + test_time +
                ", choose_number=" + choose_number +
                ", choose_gader=" + choose_gader +
                ", completion_number=" + completion_number +
                ", completion_gader=" + completion_gader +
                ", recogized_num=" + recogized_number +
                ", recogized_gader=" + recogized_gader +
                ", grade=" + grade +
                ", recongnized_rander_num=" + recongnized_rander_num +
                ", completion_rander_num=" + completion_rander_num +
                ", choose_rander_num=" + choose_rander_num +
                '}';
    }

    public void setTest_start_time(String test_start_time) {
        this.test_start_time = test_start_time;
    }
}
