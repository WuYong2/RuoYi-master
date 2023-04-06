package com.ruoyi.web.controller.utils;

public class DataResults<T> {

    private int code;
    private String msg;
    private T data;

    public DataResults() {
    }

    private DataResults(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static DataResults success(com.ruoyi.web.controller.utils.ResultCode resultCode){
        DataResults resultCommon = new DataResults(resultCode.getCode(), resultCode.getMsg());
        return resultCommon;
    }

    public static DataResults success(com.ruoyi.web.controller.utils.ResultCode resultCode, Object data){
        DataResults success = success(resultCode);
        success.setData(data);
        return success;
    }

    public static DataResults fail(com.ruoyi.web.controller.utils.ResultCode resultCode){
        return success(resultCode);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataResults{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
