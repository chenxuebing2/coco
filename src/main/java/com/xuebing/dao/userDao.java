package com.xuebing.dao;

import org.apache.ibatis.annotations.Param;

import com.xuebing.entity.user;

public interface userDao {
	user selectByUsername(@Param("USERNAME") String username) throws Exception;
}
