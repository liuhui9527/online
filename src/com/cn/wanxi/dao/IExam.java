package com.cn.wanxi.dao;

import com.cn.wanxi.entity.ExamEntity;
import com.cn.wanxi.entity.ExamPaperEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 关于考试的接口
 */
@Repository
public interface IExam {

    /**
     * 通过学生id去获取所有的考试信息
     *
     * @return 考试信息集合
     */
    List<ExamPaperEntity> getAllExam(Integer student_Id); //获取学生所有考试信息

    /**
     * 通过试卷Id获取试卷内容
     *
     * @param Student_Id
     * @return
     */
    List<ExamEntity> getExamPaperById(Integer Student_Id);

    /**
     * 通过试卷的Id获取试卷的答案
     *
     * @param ExamPaperId
     * @return 返回带答案的集合
     */
    List<ExamEntity> getExamPaperAnswer(Integer ExamPaperId);

    /**
     * 插入学生的分数
     *
     * @param mark 分数
     * @return
     */
    Integer AddStudentMark(Integer mark, Integer studentId);


}
