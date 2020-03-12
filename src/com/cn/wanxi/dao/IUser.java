package com.cn.wanxi.dao;

import com.cn.wanxi.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * author:
 * time: 2020/3/6
 * describe:登录验证的接口
 */
@Repository
public interface IUser {

    /**
     * @param userEntity 通过对象传入登录的用户名密码
     * @return 返回查询结果
     */
    List<UserEntity> getUser(UserEntity userEntity);

    /**
     * 修改数据
     *
     * @param userEntity
     * @return 受影响的数据条数
     */
    Integer updateMessage(UserEntity userEntity);
}
