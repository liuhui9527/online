package com.cn.wanxi.control;

import com.cn.wanxi.common.Message;
import com.cn.wanxi.service.RoleService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/role")
public class RoleControl {
    @Autowired
    private RoleService roleService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/findAllRole")
    public void findAllRole(HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        JSONArray jsonArray = JSONArray.fromObject(new Message(1, "", roleService.findAllRole()));
        response.getWriter().println(jsonArray.toString());
    }
}
