package com.cn.wanxi.service;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.service
 * @Author: lld
 * @CreateTime: 2020-03-10 21:36
 * @Description: service
 */

import com.cn.wanxi.dao.Questions_paperDao;
import com.cn.wanxi.entity.Questions_paperEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName Questions_paperService
 *@Author lld
 *@Date 2020/3/10 21:36
 *@Version 1.0
 **/
@Service
public class Questions_paperService {
    @Autowired
    private Questions_paperDao questions_paperDao;

    public List<Questions_paperEntity> findAll(Questions_paperEntity questions_paperEntity){
        return questions_paperDao.findAll(questions_paperEntity);
    }
    public int add(Questions_paperEntity questions_paperEntity){
        return questions_paperDao.add(questions_paperEntity);
    }
    public int del(Questions_paperEntity questions_paperEntity){
        return questions_paperDao.del(questions_paperEntity);
    }
    public int update(Questions_paperEntity questions_paperEntity){
        return questions_paperDao.update(questions_paperEntity);
    }
    public List<Questions_paperEntity> getById(Questions_paperEntity questions_paperEntity){
        return questions_paperDao.getById(questions_paperEntity);
    }
}
