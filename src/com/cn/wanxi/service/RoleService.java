package com.cn.wanxi.service;

import com.cn.wanxi.dao.RoleDao;
import com.cn.wanxi.entity.RoleUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleDao roleDao;
    public List<RoleUserEntity> findAll(){
        return roleDao.findAll();
    }
    public List<RoleUserEntity> findAllRole(){
        return roleDao.findAllRole();
    }
}
