package com.cn.wanxi.entity;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.entity
 * @Author: lld
 * @CreateTime: 2020-03-10 20:56
 * @Description: entity
 */

/**
 *@ClassName Test_paper
 *@Author lld
 *@Date 2020/3/10 20:56
 *@Version 1.0
 **/
public class Test_paperEntity {
    private int paper_id;
    private String paper_subject;
    private  String paper_rollOfPeople;
    private String paper_direction;
    private int paper_sumScore;

    public int getPaper_id() {
        return paper_id;
    }

    public void setPaper_id(int paper_id) {
        this.paper_id = paper_id;
    }

    public String getPaper_subject() {
        return paper_subject;
    }

    public void setPaper_subject(String paper_subject) {
        this.paper_subject = paper_subject;
    }

    public String getPaper_rollOfPeople() {
        return paper_rollOfPeople;
    }

    public void setPaper_rollOfPeople(String paper_rollOfPeople) {
        this.paper_rollOfPeople = paper_rollOfPeople;
    }

    public String getPaper_direction() {
        return paper_direction;
    }

    public void setPaper_direction(String paper_direction) {
        this.paper_direction = paper_direction;
    }

    public int getPaper_sumScore() {
        return paper_sumScore;
    }

    public void setPaper_sumScore(int paper_sumScore) {
        this.paper_sumScore = paper_sumScore;
    }
}
