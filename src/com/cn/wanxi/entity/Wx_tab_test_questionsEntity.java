package com.cn.wanxi.entity;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.entity
 * @Author: lld
 * @CreateTime: 2020-03-11 13:53
 * @Description: entity
 */

/**
 *@ClassName wx_tab_test_questionsEntity
 *@Author lld
 *@Date 2020/3/11 13:53
 *@Version 1.0
 **/
public class Wx_tab_test_questionsEntity {
    private int question_id;
    private String question_subject;
    private String question_type;
    private String question_option;
    private String question_answer;
    private String question_level;
    private String question_direction;

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion_subject() {
        return question_subject;
    }

    public void setQuestion_subject(String question_subject) {
        this.question_subject = question_subject;
    }

    public String getQuestion_type() {
        return question_type;
    }

    public void setQuestion_type(String question_type) {
        this.question_type = question_type;
    }

    public String getQuestion_option() {
        return question_option;
    }

    public void setQuestion_option(String question_option) {
        this.question_option = question_option;
    }

    public String getQuestion_answer() {
        return question_answer;
    }

    public void setQuestion_answer(String question_answer) {
        this.question_answer = question_answer;
    }

    public String getQuestion_level() {
        return question_level;
    }

    public void setQuestion_level(String question_level) {
        this.question_level = question_level;
    }

    public String getQuestion_direction() {
        return question_direction;
    }

    public void setQuestion_direction(String question_direction) {
        this.question_direction = question_direction;
    }
}
