package com.lean.www.dispatcher.dao;

import com.lean.www.dispatcher.model.Group;
import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2015-2019
 * Author:   zhengzp
 * Date:     2019/3/24 下午11:05
 * Description:
 */
@Component
public interface GroupDao {

    Group getById(@Param("id") Integer id) throws DataAccessException;
}
