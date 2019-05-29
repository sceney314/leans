package com.lean.api.base;

import com.lean.api.common.Codes;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/23 下午6:24
 * Description: 成功结果
 */
public class SuccessResult<T> extends AbstractResult<T> {
    public SuccessResult() {
        this.error = new Error(Codes.SUCCESS_CODE, Codes.SUCCESS_MSG);
        this.data = (T) "";
    }

    public SuccessResult(T data) {
        super(new Error(Codes.SUCCESS_CODE, Codes.SUCCESS_MSG), data);
    }

    public SuccessResult(Error error, T data) {
        super(error, data);
    }
}
