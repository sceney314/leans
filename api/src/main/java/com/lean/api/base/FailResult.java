package com.lean.api.base;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/23 下午6:08
 * Description: 失败结果
 */
public class FailResult<T> extends AbstractResult<T>{

    public FailResult() {
        this.error = new Error();
        this.data =  (T) "";
    }

    public FailResult(Error error){
        this.error = error;
        this.data =  (T) "";
    }

    public FailResult(Error error, T data){
        super(error, data);
    }
}
