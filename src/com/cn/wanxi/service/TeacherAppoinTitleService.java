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

    public TeacherAppointTitleEntity getbyid(Integer id){
        return teacherAppointTitleDao.getById(id);
    }
    public int add(TeacherAppointTitleEntity teacherAppointTitleEntity) {
        return teacherAppointTitleDao.addTestTitle(teacherAppointTitleEntity);
    }

    public List<TeacherAppointTitleEntity> findall(TeacherAppointTitleEntity teacherAppointTitleEntity) {
        return teacherAppointTitleDao.findAll(teacherAppointTitleEntity);
    }

    public int delete(int id) {
        return teacherAppointTitleDao.deleteTestTitle(id);
    }

    public int update(TeacherAppointTitleEntity teacherAppointTitleEntity) {
        return teacherAppointTitleDao.updateTestTitle(teacherAppointTitleEntity);
    }
}
