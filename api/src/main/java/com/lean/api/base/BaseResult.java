package com.lean.api.base;

import com.lean.api.common.Codes;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/23 下午4:51
 * Description: 返回结果
 */
public class BaseResult {

    // 返回成功方法
    public static Result success(){
        return new SuccessResult();
    }

    public static <T> Result<T> success(T data){
        return new SuccessResult<>(data);
    }

    public static <T> Result<T> success(Integer code, T data){
        return new SuccessResult<>(new Error(code, Codes.SUCCESS_MSG), data);
    }

    public static <T> Result<T> success(Integer code, String message, T data){
        return new SuccessResult<>(new Error(code, message), data);
    }


    // 返回失败方法
    public static Result fail(){
        return new FailResult();
    }

    public static Result fail(Integer code){
        return new FailResult(new Error(code));
    }

    public static Result fail(Integer code, String message){
        return new FailResult(new Error(code, message));
    }

    @SuppressWarnings("unchecked")
    public static <T> Result<T> fail(Integer code, T data){
        return new FailResult(new Error(code), data);
    }

    @SuppressWarnings("unchecked")
    public static <T> Result<T> fail(Integer code, String message, T data){
        return new FailResult(new Error(code, message), data);
    }

    @SuppressWarnings("unchecked")
    public static <T> Result<T> fail(Error error, T data){
        return new FailResult(error, data);
    }
}
