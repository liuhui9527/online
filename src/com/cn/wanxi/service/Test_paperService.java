package com.cn.wanxi.service;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.service
 * @Author: lld
 * @CreateTime: 2020-03-10 21:05
 * @Description: service
 */

import com.cn.wanxi.dao.Test_paperDao;
import com.cn.wanxi.entity.Test_paperEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName Test_paperService
 *@Author lld
 *@Date 2020/3/10 21:05
 *@Version 1.0
 **/
@Service
public class Test_paperService {
    @Autowired
    private Test_paperDao test_paperDao;
    public List<Test_paperEntity> findAll(Test_paperEntity test_paperEntity){
        return test_paperDao.findAll(test_paperEntity);
    }
    public int add(Test_paperEntity test_paperEntity){
        return test_paperDao.add(test_paperEntity);
    }
    public int delete(Test_paperEntity test_paperEntity){
        return test_paperDao.del(test_paperEntity);
    }
    public int update(Test_paperEntity test_paperEntity){
        return test_paperDao.update(test_paperEntity);
    }
    public List<Test_paperEntity> getById(Test_paperEntity test_paperEntity){
        return test_paperDao.getById(test_paperEntity);
    }
}
