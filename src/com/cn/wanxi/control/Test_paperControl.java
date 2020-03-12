package com.cn.wanxi.control;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.control
 * @Author: lld
 * @CreateTime: 2020-03-11 09:55
 * @Description: control
 */

import com.cn.wanxi.dao.Test_paperDao;
import com.cn.wanxi.entity.Test_paperEntity;
import com.cn.wanxi.service.TestPaperService;
import com.cn.wanxi.service.Test_paperService;
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
 *@ClassName Test_paperControl
 *@Author lld
 *@Date 2020/3/11 9:55
 *@Version 1.0
 **/
@Controller
@RequestMapping("/wanxi")
public class Test_paperControl {
    @Autowired
    private Test_paperService test_paperService;

    @RequestMapping("/test_paperfindall")
    @ResponseBody
    public void findAll(HttpServletResponse response, HttpServletRequest request) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String paper_subject = request.getParameter("paper_subject");
        Test_paperEntity test_paperEntity = new Test_paperEntity();
        test_paperEntity.setPaper_subject(paper_subject);
        List<Test_paperEntity> list = test_paperService.findAll(test_paperEntity);
        JSONObject json = new JSONObject();
        json.put("result",list);
        response.getWriter().write(json.toString());
    }
    @RequestMapping("/test_paperadd")
    @ResponseBody
    public void add(HttpServletResponse response, HttpServletRequest request) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
//        String Paper_id = request.getParameter("paper_id");
        String paper_subject = request.getParameter("paper_subject");
        String paper_rollOfPeople = request.getParameter("paper_rollOfPeople");
        String paper_direction = request.getParameter("paper_direction");
        String Paper_sumScore = request.getParameter("paper_sumScore");
     /* int paper_id = Paper_id != null && !Paper_id.equals("") ? Integer.parseInt(Paper_id) : 0;
        int paper_subject = Paper_subject != null && !Paper_subject.equals("") ? Integer.parseInt(Paper_subject) : 0;
        int paper_rollOfPeople = Paper_rollOfPeople != null && !Paper_rollOfPeople.equals("") ? Integer.parseInt(Paper_rollOfPeople) : 0;
        int paper_direction = Paper_direction != null && !Paper_direction.equals("") ? Integer.parseInt(Paper_direction) : 0;*/
        int paper_sumScore = Paper_sumScore != null && !Paper_sumScore.equals("") ? Integer.parseInt(Paper_sumScore) : 0;
        Test_paperEntity test_paperEntity = new Test_paperEntity();
        test_paperEntity.setPaper_subject(paper_subject);
        test_paperEntity.setPaper_direction(paper_direction);
        test_paperEntity.setPaper_rollOfPeople(paper_rollOfPeople);
        test_paperEntity.setPaper_sumScore(paper_sumScore);
        int result = test_paperService.add(test_paperEntity);
        JSONObject json = new JSONObject();
        json.put("result",result);
        response.getWriter().write(json.toString());
    }
    @RequestMapping("/test_paperdelete")
    @ResponseBody
    public void delete(HttpServletResponse response, HttpServletRequest request) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String Paper_id = request.getParameter("paper_id");
        int paper_id = Paper_id != null && !Paper_id.equals("") ? Integer.parseInt(Paper_id) : 0;
        Test_paperEntity test_paperEntity = new Test_paperEntity();
        test_paperEntity.setPaper_id(paper_id);
        int result = test_paperService.delete(test_paperEntity);
        JSONObject json = new JSONObject();
        json.put("result",result);
        response.getWriter().write(json.toString());
    }
    @RequestMapping("/test_paperupdate")
    @ResponseBody
    public void update(HttpServletResponse response, HttpServletRequest request) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String Paper_id = request.getParameter("paper_id");
        String paper_subject = request.getParameter("paper_subject");
        String paper_rollOfPeople = request.getParameter("paper_rollOfPeople");
        String paper_direction = request.getParameter("paper_direction");
        String Paper_sumScore = request.getParameter("paper_sumScore");
     /* int paper_id = Paper_id != null && !Paper_id.equals("") ? Integer.parseInt(Paper_id) : 0;
        int paper_subject = Paper_subject != null && !Paper_subject.equals("") ? Integer.parseInt(Paper_subject) : 0;
        int paper_rollOfPeople = Paper_rollOfPeople != null && !Paper_rollOfPeople.equals("") ? Integer.parseInt(Paper_rollOfPeople) : 0;
        int paper_direction = Paper_direction != null && !Paper_direction.equals("") ? Integer.parseInt(Paper_direction) : 0;*/
        int paper_sumScore = Paper_sumScore != null && !Paper_sumScore.equals("") ? Integer.parseInt(Paper_sumScore) : 0;
        Test_paperEntity test_paperEntity = new Test_paperEntity();
        test_paperEntity.setPaper_subject(paper_subject);
        test_paperEntity.setPaper_direction(paper_direction);
        test_paperEntity.setPaper_rollOfPeople(paper_rollOfPeople);
        test_paperEntity.setPaper_sumScore(paper_sumScore);
        int result = test_paperService.update(test_paperEntity);
        JSONObject json = new JSONObject();
        json.put("result",result);
        response.getWriter().write(json.toString());
    }
    @RequestMapping("/test_papergetbyid")
    @ResponseBody
    public void getById(HttpServletResponse response, HttpServletRequest request) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String Paper_id = request.getParameter("paper_id");
        int paper_id = Paper_id != null && !Paper_id.equals("") ? Integer.parseInt(Paper_id) : 0;
        Test_paperEntity test_paperEntity = new Test_paperEntity();
        test_paperEntity.setPaper_id(paper_id);
        List<Test_paperEntity> list = test_paperService.getById(test_paperEntity);
        JSONObject json = new JSONObject();
        json.put("result",list);
        response.getWriter().write(json.toString());
    }
}
