package com.lean.www.provider.controller;

import com.lean.api.base.BaseResult;
import com.lean.api.base.Result;
import com.lean.www.dispatcher.utils.PropertiesUtil;
import com.lean.www.dispatcher.utils.UidGeneratorUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


/**
 * Copyright (C), 2015-2018
 * Author:   zhengzp
 * Date:     2018/8/17 下午8:58
 * Description: 测试
 */
@Controller
@RequestMapping("/test/api")
public class TestContoller {

    @ResponseBody
    @RequestMapping(value = "/testProperty")
    public Result testProperty(){
        Map<String, String> map = PropertiesUtil.getPropertiesMap();
        UidGeneratorUtil uidGeneratorUtil = new UidGeneratorUtil(0, 0);
        map.put("UidGenerator", String.valueOf(uidGeneratorUtil.nextId()));
        return BaseResult.success(map);
    }
}
