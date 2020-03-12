package com.cn.wanxi.control;

import com.cn.wanxi.common.Message;
import com.cn.wanxi.common.ReturnData;
import com.cn.wanxi.entity.ExamEntity;
import com.cn.wanxi.entity.ExamPaperEntity;
import com.cn.wanxi.service.ExamService;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * author:
 * time: 2020/3/7
 * describe:
 */
@Controller
@RequestMapping("/ExamControl")
public class ExamControl {

    @Autowired
    private ExamService examService;

    @Autowired
    private HttpServletRequest request;

    @PostMapping("/getExamPaper")
    @ResponseBody
    public void getExamPaper(HttpServletResponse response) { //获取一份考试的试卷题目
        Integer examPaper_Id = Integer.valueOf(request.getParameter("id")); //获取将要考试的试卷Id
        List<ExamEntity> list = examService.ExamPaper(examPaper_Id);
        ReturnData.RGP(1, "", list, response);
    }

    @PostMapping("/getMark")
    @ResponseBody
    public void getMark(ExamEntity[] studentResult, HttpServletResponse response) { //考试完成获取考试分数
        Integer examResult = examService.getMark(studentResult); //还未传入考试结果
        boolean result = AddStudentMark(examResult); //将成绩插入学生成绩
        if (result) {
            ReturnData.RGP(1, "改卷成功", examResult, response);
        } else {
            ReturnData.RGP(0, "考试出错", examResult, response);
        }
    }

    @PostMapping("/getAllExam")
    @ResponseBody
    public void getAllExam(HttpServletResponse response) {//返回一个学生所有考试的信息
        List<ExamPaperEntity> list = examService.getAllExam(1);
        ReturnData.RGP(1, "", list, response);
    }

    /**
     * 将分数插入学生考试成绩中
     *
     * @param mark
     * @return 插入结果
     */
    private boolean AddStudentMark(Integer mark) {
        Integer studentId = Integer.valueOf(request.getParameter("studentId")); //获取学生学号
        return examService.AddMark(mark, studentId);
    }
}
