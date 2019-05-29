package com.lean.www.provider.controller;

import com.lean.api.base.BaseResult;
import com.lean.api.base.Result;
import com.lean.www.dispatcher.model.Group;
import com.lean.www.dispatcher.service.GroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/23 下午3:05
 * Description:
 */
@Controller
public class MonitorController {
    private static final Logger log = LoggerFactory.getLogger(MonitorController.class);

    @Autowired
    private GroupService groupService;

    @RequestMapping(value = "/check")
    @ResponseBody
    public Result check(){
        Group group = groupService.getById(1);
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        String value = jedis.get("testkey");
        Map<String, Object> map = new HashMap<>();
        map.put("db", group);
        map.put("redis", value);
        return BaseResult.success(map);
    }
}
