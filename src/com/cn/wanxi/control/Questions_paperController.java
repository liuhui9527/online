package com.cn.wanxi.control;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.control
 * @Author: lld
 * @CreateTime: 2020-03-11 08:49
 * @Description: control
 */

import com.cn.wanxi.entity.Questions_paperEntity;
import com.cn.wanxi.service.Questions_paperService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 *@ClassName Test_QuestionsController
 *@Author lld
 *@Date 2020/3/11 8:49
 *@Version 1.0
 **/
@Controller
@RequestMapping("/wanxi")
public class Questions_paperController {

    @Autowired
    private Questions_paperService questions_paperService;

    @RequestMapping("/Question_paperFindAll")
    @ResponseBody
    public void findAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String Paper_id = request.getParameter("paper_id");
        String Question_id = request.getParameter("question_id");
        int paper_id = Paper_id !=null && !Paper_id.equals("") ? Integer.parseInt(Paper_id) :0;
        int question_id = Question_id != null && !Question_id.equals("") ?Integer.parseInt(Question_id) : 0;
        Questions_paperEntity questions_paperEntity = new Questions_paperEntity();
        questions_paperEntity.setPaper_id(paper_id);
        questions_paperEntity.setQuestion_id(question_id);
        List<Questions_paperEntity> list = questions_paperService.findAll(questions_paperEntity);
        JSONObject json = new JSONObject();
        json.put("result",list);
        response.getWriter().write(json.toString());
    }
    @RequestMapping("/Question_paperadd")
    @ResponseBody
    public void add(HttpServletResponse response,HttpServletRequest request) throws IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String Paper_id = request.getParameter("paper_id");
        String Question_id = request.getParameter("question_id");
        int paper_id = Paper_id !=null && !Paper_id.equals("") ? Integer.parseInt(Paper_id) :0;
        int question_id = Question_id != null && !Question_id.equals("") ?Integer.parseInt(Question_id) : 0;
        Questions_paperEntity questions_paperEntity = new Questions_paperEntity();
        questions_paperEntity.setPaper_id(paper_id);
        questions_paperEntity.setQuestion_id(question_id);
        int result = questions_paperService.add(questions_paperEntity);
        JSONObject json = new JSONObject();
        json.put("result",result);
        response.getWriter().write(json.toString());
    }
    @RequestMapping("Question_paperdelete")
    @ResponseBody
    public void delete(HttpServletRequest request,HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String Question_id = request.getParameter("question_id");
        int question_id = Question_id != null && !Question_id.equals("") ?Integer.parseInt(Question_id) : 0;
        Questions_paperEntity questions_paperEntity = new Questions_paperEntity();
        questions_paperEntity.setQuestion_id(question_id);
        int result = questions_paperService.del(questions_paperEntity);
        JSONObject json = new JSONObject();
        json.put("result",result);
        response.getWriter().write(json.toString());
    }
    @RequestMapping("/Question_paperupdate")
    @ResponseBody
    public void update(HttpServletResponse response,HttpServletRequest request) throws IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String Paper_id = request.getParameter("paper_id");
        String Question_id = request.getParameter("question_id");
        int paper_id = Paper_id !=null && !Paper_id.equals("") ? Integer.parseInt(Paper_id) :0;
        int question_id = Question_id != null && !Question_id.equals("") ?Integer.parseInt(Question_id) : 0;
        Questions_paperEntity questions_paperEntity = new Questions_paperEntity();
        questions_paperEntity.setPaper_id(paper_id);
        questions_paperEntity.setQuestion_id(question_id);
        int result = questions_paperService.update(questions_paperEntity);
        JSONObject json = new JSONObject();
        json.put("result",result);
        response.getWriter().write(json.toString());
    }
    @RequestMapping("Question_papergetbyid")
    @ResponseBody
    public void getbyid(HttpServletRequest request,HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String Question_id = request.getParameter("question_id");
        int question_id = Question_id != null && !Question_id.equals("") ?Integer.parseInt(Question_id) : 0;
        Questions_paperEntity questions_paperEntity = new Questions_paperEntity();
        questions_paperEntity.setQuestion_id(question_id);
        List<Questions_paperEntity> list = questions_paperService.getById(questions_paperEntity);
        JSONObject json = new JSONObject();
        json.put("result",list);
        response.getWriter().write(json.toString());
    }
}
