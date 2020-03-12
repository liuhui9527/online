package com.cn.wanxi.control;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.control
 * @Author: lld
 * @CreateTime: 2020-03-06 16:06
 * @Description: control
 */

import com.cn.wanxi.entity.TeacherAppointTitleEntity;
import com.cn.wanxi.service.TeacherAppoinTitleService;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

/**
 * @ClassName TeacherAppointTitle
 * @Author lld
 * @Date 2020/3/6 16:06
 * @Version 1.0
 **/
@Controller
@RequestMapping("/wanxi")
public class TeacherAppointTitle {
    @Autowired
    TeacherAppoinTitleService teacherAppoinTitleService;

    @RequestMapping("/teacherappoint")
    @ResponseBody
    public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int result_add = 0;
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String subject = request.getParameter("subject");
        String grade = request.getParameter("grade");
        String titlemodel = request.getParameter("titlemodel");
        String title = request.getParameter("title");
        String daan = request.getParameter("daan");
        TeacherAppointTitleEntity teacherAppointTitleEntity = new TeacherAppointTitleEntity();
        teacherAppointTitleEntity.setSubject(subject);
        teacherAppointTitleEntity.setTest_answer(daan);
        teacherAppointTitleEntity.setTitle_model(titlemodel);
        teacherAppointTitleEntity.setTest_title(title);
        teacherAppointTitleEntity.setGrade(grade);

        try {
            result_add = teacherAppoinTitleService.add(teacherAppointTitleEntity);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            String message = result_add == 1 ? "新增成功" : "新增失败,请检查是否有数据为空";
            JSONObject json = new JSONObject();
            json.put("result", message);
            response.getWriter().write(json.toString());
        }
        /*JSONArray jsonArray = JSONArray.fromObject(message);
        response.getWriter().println(jsonArray.toString());*/

    }

    @RequestMapping("/findall")
    @ResponseBody
    public void findall(HttpServletResponse response, HttpServletRequest request) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String subject = request.getParameter("subject");
        String grade = request.getParameter("grade");
        TeacherAppointTitleEntity teacherAppointTitleEntity = new TeacherAppointTitleEntity();
        teacherAppointTitleEntity.setGrade(grade);
        teacherAppointTitleEntity.setSubject(subject);
        List<TeacherAppointTitleEntity> list = teacherAppoinTitleService.findAll(teacherAppointTitleEntity);
        JSONObject json = new JSONObject();
        json.put("result", list);
        for (TeacherAppointTitleEntity appointTitleEntity : list) {
            System.out.println(appointTitleEntity);
        }
        response.getWriter().write(json.toString());
    }

    @RequestMapping("/delete")
    @ResponseBody
    public void delete(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String r_id = request.getParameter("id");
        int id = r_id !=null && !r_id.equals("") ? Integer.parseInt(r_id):0;
        int result = teacherAppoinTitleService.del(id);
        String mesage = result == 1 ? "删除成功" : "删除失败";
        JSONObject json = new JSONObject();
        json.put("result",mesage);
        response.getWriter().write(json.toString());
    }
    @RequestMapping("/update")
    @ResponseBody
    public void update(HttpServletRequest request,HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String id_1 = request.getParameter("id");
        String subject = request.getParameter("subject");
        String titlemodel = request.getParameter("titlemodel");
        String grade = request.getParameter("grade");
        String title = request.getParameter("title");
        String daan = request.getParameter("daan");
        int id = id_1 !=null && !id_1.equals("") ? Integer.parseInt(id_1) : 0;
        TeacherAppointTitleEntity teacherAppointTitleEntity = new TeacherAppointTitleEntity();
        teacherAppointTitleEntity.setSubject(subject);
        teacherAppointTitleEntity.setGrade(grade);
        teacherAppointTitleEntity.setTest_title(title);
        teacherAppointTitleEntity.setTitle_model(titlemodel);
        teacherAppointTitleEntity.setTest_answer(daan);
        teacherAppointTitleEntity.setId(id);
        int result = teacherAppoinTitleService.update(teacherAppointTitleEntity);
        String mesage = result == 1 ? "修改成功" :"修改失败";
        JSONObject json = new JSONObject();
        json.put("result",mesage);
        response.getWriter().write(json.toString());
    }
    @RequestMapping("/findById")
    @ResponseBody
    public void findById(HttpServletResponse response,HttpServletRequest request) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String r_id = request.getParameter("id");
        int id = r_id !=null && !r_id.equals("") ? Integer.parseInt(r_id) : 0;
        TeacherAppointTitleEntity list = teacherAppoinTitleService.getById(id);
        JSONObject json = new JSONObject();
        json.put("result",list);
        response.getWriter().write(json.toString());
    }
}
