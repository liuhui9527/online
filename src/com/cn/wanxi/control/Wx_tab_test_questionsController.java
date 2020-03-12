package com.cn.wanxi.control;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.control
 * @Author: lld
 * @CreateTime: 2020-03-11 14:13
 * @Description: control
 */

import com.cn.wanxi.entity.Wx_tab_test_questionsEntity;
import com.cn.wanxi.service.Wx_tab_test_questionsService;
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
 *@ClassName Wx_tab_test_questionsController
 *@Author lld
 *@Date 2020/3/11 14:13
 *@Version 1.0
 **/
@Controller
@RequestMapping("/wanxi")
public class Wx_tab_test_questionsController {
    @Autowired
    private Wx_tab_test_questionsService wx_tab_test_questionsService;
    @RequestMapping("/findTitle")
    @ResponseBody
    public void findtitle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String question_direction = request.getParameter("question_direction");
        String question_type = request.getParameter("question_type");
        Wx_tab_test_questionsEntity wx_tab_test_questionsEntity = new Wx_tab_test_questionsEntity();
        wx_tab_test_questionsEntity.setQuestion_direction(question_direction);
        wx_tab_test_questionsEntity.setQuestion_type(question_type);
        List<Wx_tab_test_questionsEntity> list = wx_tab_test_questionsService.findTitle(wx_tab_test_questionsEntity);
        JSONObject json = new JSONObject();
        json.put("result",list);
        response.getWriter().write(json.toString());
    }
}
