package com.lean.www.dispatcher.exceptions;

import com.lean.www.dispatcher.common.CodeConst;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/26 下午4:47
 * Description:
 */
public class ServiceException extends RuntimeException{
    private Integer errorCode;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public ServiceException(String errorMsg) {
        super(errorMsg);
        this.errorCode = CodeConst.FAIL_CODE;
    }

    public ServiceException(String errorMsg, Integer errorCode) {
        super(errorMsg);
        this.errorCode = errorCode;
    }
}
