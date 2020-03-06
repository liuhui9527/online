package com.cn.wanxi.control;

import com.cn.wanxi.common.Message;
import com.cn.wanxi.entity.RoleUserEntity;
import com.cn.wanxi.entity.UserEntity;
import com.cn.wanxi.service.RoleService;
import com.cn.wanxi.service.UserService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class LoginControl {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/add")
    @ResponseBody
    public void add(HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String userid = request.getParameter("id");
//        int id = userid != null && !userid.equals("") ? Integer.parseInt(userid) : 0;
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        int a = userService.add(userEntity);
//        JSONArray jsonArray = JSONArray.fromObject(new Message(1,"新增成功",a));

//        UserEntity userEntity1 = userService.getById(id);
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        System.out.println(1111);{code:"1",status:"",data:list}
//        System.out.println(username + "----" + password);
//        JSONArray jsonArray = JSONArray.fromObject(userEntity1);

//        List<RoleUserEntity> list = roleService.findAll();

        JSONArray jsonArray = JSONArray.fromObject(new Message(1, a == 1 ? "新增成功" : "新增失败", a));
        response.getWriter().println(jsonArray.toString());

    }

    @ResponseBody
    @RequestMapping("/findAll")
    public void findAll(HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        List<RoleUserEntity> list = roleService.findAll();
        JSONArray jsonArray = JSONArray.fromObject(new Message(1, "", list));
        response.getWriter().println(jsonArray.toString());
    }

    @ResponseBody
    @RequestMapping("/update")
    public void update(HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String userid = request.getParameter("id");
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(username);
        userEntity.setPassword(password);
        int id = userid != null && !userid.equals("") ? Integer.parseInt(userid) : 0;
        userEntity.setId(id);
        int result = userService.update(userEntity);
        JSONArray jsonArray = JSONArray.fromObject(new Message(1, "", result));
        response.getWriter().println(jsonArray.toString());
    }

    @ResponseBody
    @RequestMapping("/delete")
    public void delete(HttpServletResponse response) throws IOException {
        String userid = request.getParameter("id");
        int id = userid != null && !userid.equals("") ? Integer.parseInt(userid) : 0;
        JSONArray jsonArray = JSONArray.fromObject(new Message(1, "", userService.delete(id)));
        response.getWriter().println(jsonArray.toString());
    }

    /**
     * 自动去项目里面查找返回的页面
     *
     * @return
     */
    @RequestMapping("/tiaozhuan")
    public String tiaozhuan() {
        return "html/UserUpdate";
    }

    @RequestMapping("/findById")
    @ResponseBody
    public void findById(HttpServletResponse response) throws IOException {
        String userid = request.getParameter("id");
        int id = userid != null && !userid.equals("") ? Integer.parseInt(userid) : 0;
        JSONArray jsonArray = JSONArray.fromObject(new Message(1, "", userService.findById(id)));
        response.getWriter().println(jsonArray.toString());
    }
}
