package com.cn.wanxi.control;

import com.cn.wanxi.common.Message;
import com.cn.wanxi.entity.UserEntity;
import com.cn.wanxi.service.UserService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/User")
public class UserControl {

    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;

    /**
     * 登录验证
     */
    @PostMapping("/LoginVerify")
    @ResponseBody
    public void LoginVerify(HttpServletResponse response) {
        Boolean result = userService.LoginResult(getUserEntity(response), response);
        if (result) {
            RGP(1, "验证通过", null, response);
        } else {
            RGP(0, "账号密码错误", null, response);
        }
    }

    /**
     * 教师修改自己的信息
     */
    @RequestMapping("/ChangeMessage")
    @ResponseBody
    public void ChangeMessage(HttpServletResponse response) {
        HttpSession session = request.getSession();
        Integer id = (Integer) session.getAttribute("userId");
        String oldPassword = request.getParameter(""); //输入的旧密码
        String password = (String) session.getAttribute("passWord"); //Session保存的密码
        String newPassword = (String) request.getAttribute(""); //新密码
        UserEntity userEntity = new UserEntity();
        if (OldPasswordIsTrue(oldPassword, password)) {
            userEntity.setId(id);
            userEntity.setPassword(newPassword);
            Integer result = userService.ChangeMessageResult(userEntity);
            if (result < 1) {
                RGP(0, "修改失败", null, response);
            } else {
                RGP(1, "修改成功", null, response);
            }
        } else {
            RGP(0, "旧密码错误", null, response);
        }
    }

    private UserEntity getUserEntity(HttpServletResponse response) { //登录时从前台获取输入的数据
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        response.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String userid = request.getParameter("id");
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        int id = userid != null && !userid.equals("") ? Integer.parseInt(userid) : 0;
        userEntity.setId(id);
        return userEntity;
    }

    private Boolean OldPasswordIsTrue(String oldPassword, String newPassword) { //修改信息是进行密码验证
        if (oldPassword != newPassword) {
            return false;
        }
        return true;
    }

    private void RGP(Integer code, String result, Object obj, HttpServletResponse response) { //将数据返回页面response.getWriter().println
        JSONArray jsonArray = JSONArray.fromObject(new Message(code, result, obj));
        try {
            response.getWriter().println(jsonArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
