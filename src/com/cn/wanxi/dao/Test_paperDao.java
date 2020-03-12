package com.cn.wanxi.dao;

import com.cn.wanxi.entity.Test_paperEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.dao
 * @Author: lld
 * @CreateTime: 2020-03-10 21:00
 * @Description: dao
 */
@Repository
public interface Test_paperDao {
    List<Test_paperEntity> findAll(Test_paperEntity test_paperEntity);
    int add(Test_paperEntity test_paperEntity);
    int del(Test_paperEntity test_paperEntity);
    int update(Test_paperEntity test_paperEntity);
    List<Test_paperEntity>getById(Test_paperEntity test_paperEntity);
}
