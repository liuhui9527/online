package com.cn.wanxi.entity;

/**
 * author:
 * time: 2020/3/7
 * describe:试卷
 */
public class ExamPaperEntity {

    private Integer examPaperId; //试卷id
    private String examPaperName;  //试卷名称
    private String examPaperAuthor; // 出卷人
    private String examPaperType; // 试卷类型
    private String examPaperTime;  //考试时间
    private String examStartTime; //考试开始日期、时间

    public ExamPaperEntity() {
    }

    public ExamPaperEntity(Integer examPaperId, String examPaperName, String examPaperTime, String examPaperAuthor, String examPaperTypey) {
        this.examPaperId = examPaperId;
        this.examPaperName = examPaperName;
        this.examPaperTime = examPaperTime;
        this.examPaperAuthor = examPaperAuthor;
        this.examPaperType = examPaperType;
    }

    public Integer getExamPaperId() {
        return examPaperId;
    }

    public void setExamPaperId(Integer examPaperId) {
        this.examPaperId = examPaperId;
    }

    public String getExamPaperName() {
        return examPaperName;
    }

    public void setExamPaperName(String examPaperName) {
        this.examPaperName = examPaperName;
    }

    public String getExamPaperTime() {
        return examPaperTime;
    }

    public void setExamPaperTime(String examPaperTime) {
        this.examPaperTime = examPaperTime;
    }

    public String getExamPaperAuthor() {
        return examPaperAuthor;
    }

    public void setExamPaperAuthor(String examPaperAuthor) {
        this.examPaperAuthor = examPaperAuthor;
    }

    public String getExamPaperType() {
        return examPaperType;
    }

    public void setExamPaperType(String examPaperType) {
        this.examPaperType = examPaperType;
    }

    public String getExamStartTime() {
        return examStartTime;
    }

    public void setExamStartTime(String examStartTime) {
        this.examStartTime = examStartTime;
    }
}
