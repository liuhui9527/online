package com.cn.wanxi.entity;

/**
 * author:
 * time: 2020/3/7
 * describe:试卷内容
 */
public class ExamEntity {

    private Integer examId; //试题id
    private String examName; //试题题目
    private String examChoice; //试题选项
    private String examAnswer; //题目答案
    private String examType; //试题类型

    private Integer selectMark; //选择题目分数
    private Integer gapFillMark; //填空题
    private Integer TFMark; //判断题分数

    public ExamEntity() {

    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamChoice() {
        return examChoice;
    }

    public void setExamChoice(String examChoice) {
        this.examChoice = examChoice;
    }

    public String getExamAnswer() {
        return examAnswer;
    }

    public void setExamAnswer(String examAnswer) {
        this.examAnswer = examAnswer;
    }

    public Integer getSelectMark() {
        return selectMark;
    }

    public void setSelectMark(Integer selectMark) {
        this.selectMark = selectMark;
    }

    public Integer getGapFillMark() {
        return gapFillMark;
    }

    public void setGapFillMark(Integer gapFillMark) {
        this.gapFillMark = gapFillMark;
    }

    public Integer getTFMark() {
        return TFMark;
    }

    public void setTFMark(Integer TFMark) {
        this.TFMark = TFMark;
    }
}
