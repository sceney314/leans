package com.lean.api.base;

import com.lean.api.common.Codes;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/23 下午5:59
 * Description: 错误描述
 */
public class Error {
    // 返回状态码
    private Integer returnCode;

    // 返回系统提示信息
    private String returnMessage;

    // 返回用户提示信息
    private String returnUserMessage;

    public Error() {
        this.returnCode = Codes.FAIL_CODE;
        this.returnMessage = Codes.ERR_SYSTEM;
        this.returnUserMessage = Codes.ERR_SYSTEM;
    }

    public Error(Integer returnCode) {
        this.returnCode = returnCode;
        this.returnMessage = Codes.ERR_SYSTEM;
        this.returnUserMessage = Codes.ERR_SYSTEM;
    }

    public Error(Integer returnCode, String returnMessage) {
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
        this.returnUserMessage = returnMessage;
    }

    public Error(Integer returnCode, String returnMessage, String returnUserMessage) {
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
        this.returnUserMessage = returnUserMessage;
    }

    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public String getReturnUserMessage() {
        return returnUserMessage;
    }

    public void setReturnUserMessage(String returnUserMessage) {
        this.returnUserMessage = returnUserMessage;
    }

    @Override
    public String toString() {
        return "Error{" +
                "returnCode=" + returnCode +
                ", returnMessage='" + returnMessage + '\'' +
                ", returnUserMessage='" + returnUserMessage + '\'' +
                '}';
    }
}
