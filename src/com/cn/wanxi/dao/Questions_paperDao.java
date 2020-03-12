package com.cn.wanxi.dao;

import com.cn.wanxi.entity.Questions_paperEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.dao
 * @Author: lld
 * @CreateTime: 2020-03-10 21:31
 * @Description: dao
 */
@Repository
public interface Questions_paperDao {

    List<Questions_paperEntity> findAll(Questions_paperEntity questions_paperEntity);
    int add(Questions_paperEntity questions_paperEntity);
    int del(Questions_paperEntity questions_paperEntity);
    int update(Questions_paperEntity questions_paperEntity);
    List<Questions_paperEntity> getById(Questions_paperEntity questions_paperEntity);
}
