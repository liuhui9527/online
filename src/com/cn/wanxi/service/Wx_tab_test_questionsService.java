package com.cn.wanxi.service;/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.service
 * @Author: lld
 * @CreateTime: 2020-03-11 14:04
 * @Description: service
 */

import com.cn.wanxi.dao.Wx_tab_test_questionsDao;
import com.cn.wanxi.entity.Wx_tab_test_questionsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName Wx_tab_test_questionsService
 * @Author lld
 * @Date 2020/3/11 14:04
 * @Version 1.0
 **/
@Service
public class Wx_tab_test_questionsService {
    /**
     * @Author lld
     * @Description //TODO lld
     * @Date 10:35 2020/3/12
     * @Param
     * @return
     * @Version 1.0
     * 临时写的，用于查询试题，给出题人展示，后面接入刘辉的根据"科目"和"题型"查询的接口
     **/
    @Autowired
    private Wx_tab_test_questionsDao wx_tab_test_questionsDao;

    public List<Wx_tab_test_questionsEntity> findTitle(Wx_tab_test_questionsEntity wx_tab_test_questionsEntity) {
        return wx_tab_test_questionsDao.findByTitleModel(wx_tab_test_questionsEntity);
    }
}
