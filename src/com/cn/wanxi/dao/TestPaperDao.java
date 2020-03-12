package com.cn.wanxi.dao;

import com.cn.wanxi.entity.TestPaperEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.dao
 * @Author: lld
 * @CreateTime: 2020-03-05 15:43
 * @Description: dao
 */
@Repository
public interface TestPaperDao {
    TestPaperEntity getById(TestPaperEntity testPaperEntity);
    List<TestPaperEntity> findAll(TestPaperEntity testPaperEntity);
    int add(TestPaperEntity testPaperEntity);
    int del(TestPaperEntity testPaperEntity);
    int update(TestPaperEntity testPaperEntity);
}
