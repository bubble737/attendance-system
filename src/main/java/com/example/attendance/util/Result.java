package com.example.attendance.util;

public class Result<T> {
    private int code;
    private String message;
    private T data;

    // 无参构造方法
    public Result() {
    }

    // 全参构造方法
    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 静态方法：成功
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "success", data);
    }

    // 静态方法：成功（自定义消息）
    public static <T> Result<T> success(String message, T data) {
        return new Result<>(200, message, data);
    }

    // 静态方法：失败
    public static <T> Result<T> error(String message) {
        return new Result<>(500, message, null);
    }

    // Getter 和 Setter
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
}