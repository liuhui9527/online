package com.cn.wanxi.service;

import com.cn.wanxi.dao.IExam;
import com.cn.wanxi.entity.ExamEntity;
import com.cn.wanxi.entity.ExamPaperEntity;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * author:
 * time: 2020/3/7
 * describe:
 */
@Service
public class ExamService {

    @Autowired
    private IExam exam;

    /**
     * 通过试卷id进入考试并查询试题
     *
     * @param examPaperId 试题id
     * @return 返回试题
     */
    public List<ExamEntity> ExamPaper(Integer examPaperId) {
        return exam.getExamPaperById(examPaperId);
    }

    /**
     * 获取考试答案，并传回最终分数
     *
     * @return 考试分数
     */
    public Integer getMark(ExamEntity[] studentResult) {
        Integer result = 0; //初试分数
        List<ExamEntity> answerList = exam.getExamPaperAnswer(1); //获取答案
        Arrays.sort(studentResult); //给数组排序确保执行效率
        for (int i = 0; i < answerList.size(); i++) {
            if (answerList.get(i).getExamId() == studentResult[i].getExamId()) {
                if (answerList.get(i).getExamType() == "选择题") {

                }
            }
        }
        return result;
    }


    /**
     * 插入学生的分数
     *
     * @param mark      分数
     * @param studentId 学生学号
     * @return 插入是否成功
     */
    public Boolean AddMark(Integer mark, Integer studentId) {
        if (exam.AddStudentMark(mark, studentId) > 0) {
            return true;
        }
        return false;
    }

    public List<ExamPaperEntity> getAllExam(Integer student_Id) { //获取所有的考试信息
        return exam.getAllExam(student_Id);
    }

}
