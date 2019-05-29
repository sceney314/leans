package com.lean.www.dispatcher.service;

import com.lean.www.dispatcher.dao.GroupDao;
import com.lean.www.dispatcher.model.Group;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/25 下午9:03
 * Description:
 */
@Service
public class GroupService {
    private static final Logger log = LoggerFactory.getLogger(GroupService.class);

    @Autowired
    private GroupDao groupDao;

    public Group getById(Integer id){
        return groupDao.getById(id);
    }

}
