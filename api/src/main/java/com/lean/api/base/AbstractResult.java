package com.lean.api.base;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/23 下午6:03
 * Description: 抽象返回结构
 */
public abstract class AbstractResult<T> implements Result<T>{
    protected Error error;
    protected T data;

    public AbstractResult() {
    }

    public AbstractResult(Error error, T data) {
        this.error = error;
        this.data = data;
    }

    @Override
    public Error getError() {
        return error;
    }

    @Override
    public void setError(Error error) {
        this.error = error;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AbstractResult{" +
                "error=" + error +
                ", data=" + data +
                '}';
    }
}
