package com.cn.wanxi.dao;

import com.cn.wanxi.entity.TeacherAppointTitleEntity;
import com.cn.wanxi.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.dao
 * @Author: lld
 * @CreateTime: 2020-03-05 15:45
 * @Description: dao
 */
@Repository
public interface TeacherAppointTitleDao {
    TeacherAppointTitleEntity getById(Integer id);
    List<TeacherAppointTitleEntity> findAll(TeacherAppointTitleEntity teacherAppointTitleEntity);
    int addTestTitle(TeacherAppointTitleEntity teacherAppointTitleEntity);
    int deleteTestTitle(int id);
    int updateTestTitle(TeacherAppointTitleEntity teacherAppointTitleEntity);
}
