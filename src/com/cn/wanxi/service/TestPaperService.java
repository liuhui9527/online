package com.cn.wanxi.service;

import com.cn.wanxi.dao.TestPaperDao;
import com.cn.wanxi.entity.TestPaperEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.service
 * @Author: lld
 * @CreateTime: 2020-03-05 15:58
 * @Description: service
 * @ClassName TestPaperService
 * @Author lld
 * @Date 2020/3/5 15:58
 * @Version 1.0
 **/
@Service
public class TestPaperService {
    @Autowired
    private TestPaperDao testPaperDao;

    public TestPaperEntity getById(TestPaperEntity testPaperEntity){
        return testPaperDao.getById(testPaperEntity);
    }
    public int add(TestPaperEntity testPaperEntity) {

        return testPaperDao.add(testPaperEntity);
    }

    public int delete(TestPaperEntity testPaperEntity) {

        return testPaperDao.del(testPaperEntity);
    }

    public List<TestPaperEntity> findAll(TestPaperEntity testPaperEntity) {
        return testPaperDao.findAll(testPaperEntity);
    }

    public int update(TestPaperEntity testPaperEntity) {

        return testPaperDao.update(testPaperEntity);
    }
}
