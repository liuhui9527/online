package com.cn.wanxi.common;


import net.sf.json.JSONObject;

/**
 * 返回页面对象
 */
public class Message {
    /**
     * 返回页面状态编码
     * 1为成功
     * 0为失败
     */
    private Integer code;
    /**
     * 返回给页面的具体信息
     * 如：新增成功，谢谢使用
     */
    private String result;
    /**
     * 返回给页面的数据格式，以数组的形式返回
     */
    private Object data;

    private Message() {
    }

    /**
     * 返回给页面的对象
     * @param code 返回给页面的结果编码
     * @param result 返回给页面的结果信息
     * @param data 返回给页面的结果数据
     */
    public Message(int code, String result, Object data) {
        this.code = code;
        this.result = result;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String  result) {
        this.result = result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
