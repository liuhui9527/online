package com.cn.wanxi.dao;

import com.cn.wanxi.entity.Wx_tab_test_questionsEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @BelongsProject: online
 * @BelongsPackage: com.cn.wanxi.dao
 * @Author: lld
 * @CreateTime: 2020-03-11 13:59
 * @Description: dao
 *
 */
@Repository
public interface Wx_tab_test_questionsDao {
    /**
     * @Author lld
     * @Description //TODO lld
     * @Date 10:31 2020/3/12
     * @Param
     * @return  List<Wx_tab_test_questionsEntity>
     * @Version 1.0
     **临时写的，用来展示题，给老师出题，后面替换接入刘辉的查询接口*/
    List<Wx_tab_test_questionsEntity> findByTitleModel(Wx_tab_test_questionsEntity wx_tab_test_questionsEntity);
}
