package com.cn.wanxi.control;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.control
 * @Author: lld
 * @CreateTime: 2020-03-11 17:04
 * @Description: control
 */

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName TitleNumberAdd
 * @Author lld
 * @Date 2020/3/11 17:04
 * @Version 1.0
 **/
@Controller
@RequestMapping("/wanxi")
public class TitleNumberAdd {
    JSONObject jsondata = new JSONObject();
    @RequestMapping("/tianjia")
    @ResponseBody
    public int add(HttpServletResponse response, HttpServletRequest request) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        System.out.println("进来");
        String[] titleIds = request.getParameterValues("titleId");
        for (String titleId : titleIds) {
            System.out.println(titleId);
        }
        System.out.println(titleIds.length);
        String mesage = titleIds.length > 0 ? "添加成功":"添加失败";
        jsondata.put("result",mesage);
        jsondata.put("data_length",titleIds.length);
        /*response.sendRedirect("testpaper.html");
        JSONObject json = new JSONObject();
        json.put("data",titleIds.length);
        response.getWriter().write(json.toString());
        System.out.println(request.getContextPath()+"/");
        System.out.println("chuqu");*/
        return titleIds.length;
    }

    @RequestMapping("/return_data")
    @ResponseBody
    public void dataReturn(HttpServletRequest request,HttpServletResponse response) throws IOException {
        /*int title_length = add();
        JSONObject json = new JSONObject();
        json.put("length",title_length);*/
        System.out.println(jsondata.toString());
        response.getWriter().write(jsondata.toString());
    }
}
