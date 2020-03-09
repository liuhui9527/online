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
    TestPaperEntity getById(Integer id);
    List<TestPaperEntity> findAll();
    int addTestPaper(TestPaperEntity testPaperEntity);
    int deleteTestPaper(TestPaperEntity testPaperEntity);
    int updateTestPaper(TestPaperEntity testPaperEntity);
}
