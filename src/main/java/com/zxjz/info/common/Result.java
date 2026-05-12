package com.zxjz.info.common;

public class Result<T> {
    private String code;

    private String message;

    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> Result<T> success(T data){

        Result<T> result = new Result<>();

        result.setCode("0");
        result.setMessage("登录成功");
        result.setData(data);

        return result;
    }
    public static <T> Result<T> success(T data,String message){

        Result<T> result = new Result<>();

        result.setCode("0");
        result.setMessage(message);
        result.setData(data);

        return result;
    }


    public static Result fail(String msg){

        Result result = new Result();

        result.setCode("1");
        result.setMessage(msg);

        return result;
    }

}