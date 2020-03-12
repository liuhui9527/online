package com.cn.wanxi.common;

import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * author:
 * time: 2020/3/11
 * describe:返回json数据专用
 */
public class ReturnData {


    public static void RGP(int code, String result, Object data, HttpServletResponse response) {
        Message message = new Message(code, result, data);
        JSONArray jsonArray = JSONArray.fromObject(message);
        System.out.println(jsonArray);
        try {
            response.getWriter().println(jsonArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
