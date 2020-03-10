package com.cn.wanxi.control;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.control
 * @Author: lld
 * @CreateTime: 2020-03-05 19:04
 * @Description: control
 */

import com.cn.wanxi.entity.TestPaperEntity;
import com.cn.wanxi.service.TeacherAppoinTitleService;
import com.cn.wanxi.service.TestPaperService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName TestPaperController
 * @Author lld
 * @Date 2020/3/5 19:04
 * @Version 1.0
 **/
@Controller
@RequestMapping("/wanxi")
public class TestPaperController {
    @Autowired
    private TestPaperService testPaperService;
    /*@Autowired
    private TestPaperEntity testPaperEntity;*/


    @RequestMapping("/testpaper")
    @ResponseBody
    public void SetTestPaper(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //        考试名称：			test_name
//        考试开始时间：		test_start_time
//        测试时间：			test_time
//        科目：				subject
//        年纪：				grade
//        总分：				sum_gader
//        题目数量：			sum_title_num
//        选择题数量：		choose_number
//        选择题总分：		choose_gader
//        选择题随机抽取数量：choose_rander_num
//        选择题手动设置数量：choose_title_SD
//        判断题数量：		completion_num
//        判断题总分：		completion_gader
//        判断题随机抽取数量：completion_rander_num
//        判断题手动设置数量：completion_title2_SD
//        填空题数量：		recognized_num
//        填空题总分：		recognized_gader
//        填空题随机抽取数量：recongnized_rander_num
//        填空题手动设置数量：recongnized_title3_SD
        String test_name = request.getParameter("test_name");
        String test_Start_Time = request.getParameter("test_start_time");
        String Test_time = request.getParameter("test_time");
        String subject = request.getParameter("subject");
        String Grade = request.getParameter("grade");
        String Sum_gader = request.getParameter("sum_gader");
        String Sum_title_num = request.getParameter("sum_title_num");
        String Choose_number = request.getParameter("choose_number");
        String Choose_gader = request.getParameter("choose_gader");
        String Choose_rander_num = request.getParameter("choose_rander_num");
        String Choose_title_sd = request.getParameter("choose_title_sd");
        String Completion_num = request.getParameter("completion_num");
        String Completion_gader = request.getParameter("completion_gader");
        String Completion_rander_num = request.getParameter("completion_rander_num");
        String Completion_title_sd = request.getParameter("completion_title_sd");
        String Recognized_num = request.getParameter("recognized_num");
        String Recognized_gader = request.getParameter("recognized_gader");
        String Recongnized_rander_num = request.getParameter("recognized_rander_num");
        String Recongnized_title_sd = request.getParameter("recongnized_title_sd");
        int sum_grader = Sum_gader != "" && !Sum_gader.equals("") ? Integer.parseInt(Sum_gader) : 0;
        int sum_title_num = Sum_title_num != "" && !Sum_title_num.equals("") ? Integer.parseInt(Sum_title_num) : 0;
        int choose_number = Choose_number != "" && !Choose_number.equals("") ? Integer.parseInt(Choose_number) : 0;
        int choose_gader = Choose_gader != "" && !Choose_gader.equals("") ? Integer.parseInt(Choose_gader) : 0;
        int choose_rander_num = Choose_rander_num != "" && !Choose_rander_num.equals("") ? Integer.parseInt(Choose_rander_num) : 0;
        int choose_title_SD = Choose_title_sd != "" && !Choose_title_sd.equals("") ? Integer.parseInt(Choose_title_sd) : 0;
        int completion_num = Completion_num != "" && !Completion_num.equals("") ? Integer.parseInt(Completion_num) : 0;
        int completion_gader = Completion_gader != "" && !Completion_gader.equals("") ? Integer.parseInt(Completion_gader) : 0;
        int completion_rander_num = Completion_rander_num != "" && !Completion_rander_num.equals("") ? Integer.parseInt(Completion_rander_num) : 0;
        int completion_title2_SD = Completion_title_sd != "" && !Completion_title_sd.equals("") ? Integer.parseInt(Completion_title_sd) : 0;
        int recognized_num = Recognized_num != "" && !Recognized_num.equals("") ? Integer.parseInt(Recognized_num) : 0;
        int recognized_gader = Recognized_gader != "" && !Recognized_gader.equals("") ? Integer.parseInt(Recognized_gader) : 0;
        int recongnized_rander_num = Recongnized_rander_num != "" && !Recongnized_rander_num.equals("") ? Integer.parseInt(Recongnized_rander_num) : 0;
        int recongnized_title3_SD = Recongnized_title_sd != "" && !Recongnized_title_sd.equals("") ? Integer.parseInt(Recongnized_title_sd) : 0;
        int grade = Grade != "" && !Grade.equals("") ? Integer.parseInt(Grade) : 0;
        int test_time = Test_time != "" && !Test_time.equals("") ? Integer.parseInt(Test_time) : 0;
        TestPaperEntity testPaperEntity = new TestPaperEntity();
        testPaperEntity.setTest_name(test_name);
        testPaperEntity.setTest_start_time(test_Start_Time);
        testPaperEntity.setTest_time(test_time);
        testPaperEntity.setSubject(subject);
        testPaperEntity.setGrade(grade);
        testPaperEntity.setSum_gader(sum_grader);
        testPaperEntity.setSum_title_num(sum_title_num);
        testPaperEntity.setChoose_number(choose_number);
        testPaperEntity.setChoose_gader(choose_gader);
        testPaperEntity.setChoose_rander_num(choose_rander_num);
        testPaperEntity.setChoose_title_SD(choose_title_SD);
        testPaperEntity.setCompletion_gader(completion_gader);
        testPaperEntity.setCompletion_number(completion_num);
        testPaperEntity.setCompletion_rander_num(completion_rander_num);
        testPaperEntity.setCompletion_title_SD(completion_title2_SD);
        testPaperEntity.setRecogized_gader(recognized_gader);
        testPaperEntity.setRecogized_number(recognized_num);
        testPaperEntity.setRecongnized_rander_num(recongnized_rander_num);
        testPaperEntity.setRecongnized_title_SD(recongnized_title3_SD);
        int result_add = testPaperService.add(testPaperEntity);
       String message = result_add == 1 ? "新增成功" : "新增失败";
        System.out.println(message);
        /*JSONArray jsonArray = JSONArray.fromObject(message);
        response.getWriter().println(jsonArray.toString());*/
        JSONObject json = new JSONObject();
        json.put("result",message);
        response.getWriter().write(json.toString());
    }
    @RequestMapping("/findalltest")
    @ResponseBody
    public void findall(HttpServletResponse response,HttpServletRequest request) throws IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String subject = request.getParameter("subject");
        String Grade = request.getParameter("grade");
        int grade = Grade != null && !Grade.equals("") ? Integer.parseInt(Grade) : 0;
        TestPaperEntity testPaperEntity = new TestPaperEntity();
        testPaperEntity.setSubject(subject);
        testPaperEntity.setGrade(grade);
        List<TestPaperEntity> list = testPaperService.findall(testPaperEntity);
        JSONObject json = new JSONObject();
        json.put("result",list);
        response.getWriter().write(json.toString());
    }
}
