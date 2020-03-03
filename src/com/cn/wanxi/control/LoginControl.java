package com.cn.wanxi.control;

import com.cn.wanxi.entity.UserEntity;
import com.cn.wanxi.service.UserService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/a")
public class LoginControl {
    @Autowired
    private UserService userService;

    @RequestMapping("/b")
    @ResponseBody
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String userid = request.getParameter("id");
        int id = userid != null && !userid.equals("") ? Integer.parseInt(userid) : 0;
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        int a = userService.add(userEntity);
        UserEntity userEntity1 = userService.getById(id);
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        System.out.println(1111);{code:"1",status:"",data:list}
        System.out.println(username + "----" + password);
        JSONArray jsonArray = JSONArray.fromObject(userEntity1);
        response.getWriter().println(jsonArray.toString());

    }
}
