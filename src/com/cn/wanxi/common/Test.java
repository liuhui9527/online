package com.cn.wanxi.common;

import com.cn.wanxi.entity.UserEntity;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test {
    public static void main(String[] args) {
//        JSONObject data = JSONObject.fromObject(new UserEntity(1,"gsdf","fdsa"));
        JSONObject jsonObject=JSONObject.fromObject(new Message(0,"aa",new UserEntity(1,"gsdf","fdsa")));
        System.out.println(jsonObject);
    }
}
