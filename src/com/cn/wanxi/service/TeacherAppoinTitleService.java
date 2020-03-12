package com.cn.wanxi.service;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.service
 * @Author: lld
 * @CreateTime: 2020-03-05 16:00
 * @Description: service
 */

import com.cn.wanxi.dao.TeacherAppointTitleDao;
import com.cn.wanxi.entity.TeacherAppointTitleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TeacherAppoinTitleService
 * @Author lld
 * @Date 2020/3/5 16:00
 * @Version 1.0
 **/
@Service
public class TeacherAppoinTitleService {
    @Autowired
    private TeacherAppointTitleDao teacherAppointTitleDao;

    public TeacherAppointTitleEntity getById(Integer id){
        return teacherAppointTitleDao.getById(id);
    }
    public int add(TeacherAppointTitleEntity teacherAppointTitleEntity) {
        return teacherAppointTitleDao.add(teacherAppointTitleEntity);
    }

    public List<TeacherAppointTitleEntity> findAll(TeacherAppointTitleEntity teacherAppointTitleEntity) {
        return teacherAppointTitleDao.findAll(teacherAppointTitleEntity);
    }

    public int del(int id) {
        return teacherAppointTitleDao.del(id);
    }

    public int update(TeacherAppointTitleEntity teacherAppointTitleEntity) {
        return teacherAppointTitleDao.update(teacherAppointTitleEntity);
    }
}
