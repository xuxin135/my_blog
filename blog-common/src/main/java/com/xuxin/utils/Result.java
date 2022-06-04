package com.xuxin.utils;

public class Result<T> {
    private static int SUCCESS = 200;
    private static int FAILED = 500;
    private int code;
    private String message;
    private T data;

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 请求成功
     * @return
     * @param <T>
     */
    public static<T> Result<T> success(){
        Result<T> result = new Result<>();
        result.setCode(SUCCESS);
        result.setMessage("请求成功");
        return result;
    }

    /**
     * 请求成功，返回数据
     * @param data
     * @return
     * @param <T>
     */
    public static<T> Result<T> success(T data){
        Result<T> result = new Result<>();
        result.setCode(SUCCESS);
        result.setMessage("请求成功");
        result.setData(data);
        return result;
    }

    /**
     * 请求失败
     * @return
     * @param <T>
     */
    public static<T> Result<T> failed(String message){
        Result<T> result = new Result<>();
        result.setCode(FAILED);
        result.setMessage(message);
        return result;
    }
}
