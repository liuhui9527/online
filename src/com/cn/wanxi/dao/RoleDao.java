package com.cn.wanxi.dao;

import com.cn.wanxi.entity.RoleUserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleDao {
    List<RoleUserEntity> findAll();
    List<RoleUserEntity> findAllRole();
}
