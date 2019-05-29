package com.lean.api.base;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/23 下午5:59
 * Description:
 */
public interface Result<T> {

    // 获取错误对象
    Error getError();

    // 设置错误对象
    void setError(Error error);

    // 获取 data 域
    T getData();

    // 设置 data 域
    void setData(T t);
}
