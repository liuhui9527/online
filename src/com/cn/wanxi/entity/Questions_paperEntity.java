package com.cn.wanxi.entity;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.entity
 * @Author: lld
 * @CreateTime: 2020-03-10 21:30
 * @Description: entity
 */

/**
 *@ClassName Questions_paperEntity
 *@Author lld
 *@Date 2020/3/10 21:30
 *@Version 1.0
 **/
public class Questions_paperEntity {
    private int paper_id;
    private int question_id;

    public int getPaper_id() {
        return paper_id;
    }

    public void setPaper_id(int paper_id) {
        this.paper_id = paper_id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }
}
