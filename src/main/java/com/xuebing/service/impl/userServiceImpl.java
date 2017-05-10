package com.xuebing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xuebing.dao.userDao;
import com.xuebing.entity.user;
import com.xuebing.service.userService;

@Service
public class userServiceImpl implements userService {
	@Autowired
	private userDao userdao;

	@Override
	public user login(String username, String password) {
		user user = null;
		try {
			user = userdao.selectByUsername(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
