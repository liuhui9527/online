package com.cn.wanxi.dao;

import com.cn.wanxi.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    UserEntity getById(Integer id);
    int add(UserEntity userEntity);
    int update(UserEntity userEntity);
    int delete(Integer id);

}
