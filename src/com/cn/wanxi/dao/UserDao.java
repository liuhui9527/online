package com.cn.wanxi.dao;

import com.cn.wanxi.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    UserEntity getById(Integer id);
    int add(UserEntity userEntity);
    int update(UserEntity userEntity);
    int delete(Integer id);
    List<UserEntity> findAll();

}
