package com.lean.api.common;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/23 下午6:11
 * Description: 状态码枚举
 */
public class Codes {
    public static final Integer SUCCESS_CODE = 0;
    public static final Integer FAIL_CODE = 1;

    public static final String SUCCESS_MSG = "操作成功";
    public static final String ERR_SIGN = "签名校验未通过";
    public static final String ERR_LOGIN = "用户未登录，请先登录";
    public static final String ERR_SYSTEM = "服务繁忙，请稍后重试";
    public static final String ERR_PARAM = "参数非法";
    public static final String ERR_OPERATOR = "操作失败，请稍后重试";


}
