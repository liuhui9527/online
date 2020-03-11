package com.cn.wanxi.service;

import com.cn.wanxi.dao.IUser;
import com.cn.wanxi.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private IUser user;

    public boolean LoginResult(UserEntity userEntity, HttpServletResponse response) { //验证登录是否正确
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(); //使用request对象的getSession()获取session，如果session不存在则创建一个
        List<UserEntity> list = user.getUser(userEntity);
        if (list != null) {
            for (UserEntity entity : list) {
                if (entity.getPassword().equals(userEntity.getPassword()) && entity.getUsername().equals(userEntity.getUsername())) {
                    session.setAttribute("userId", entity.getId()); //将数据存储到session中
                    session.setAttribute("userName", entity.getUsername());
                    session.setAttribute("passWord",entity.getPassword());
                    return true;
                }
            }
        }
        return false;
    }

    public Integer ChangeMessageResult(UserEntity userEntity) { //返回修改结果
        return user.updateMessage(userEntity);
    }

}
