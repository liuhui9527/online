package com.cn.wanxi.service;

import com.cn.wanxi.dao.UserDao;
import com.cn.wanxi.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public int add(UserEntity userEntity) {

        return userDao.add(userEntity);
    }

    public UserEntity findById(Integer id) {
        return userDao.getById(id);
    }
    public int update (UserEntity userEntity){
        return userDao.update(userEntity);
    }
    public int delete(Integer userEntity){
        return userDao.delete(userEntity);
    }
}
