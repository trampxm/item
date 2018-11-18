package com.tramp.item.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tramp.item.mapper.UserMapper;
import com.tramp.item.pojo.UserDO;
import com.tramp.item.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void saveUser(UserDO user) {
		userMapper.saveUser(user);
	}

	@Override
	public List<UserDO> listUser(UserDO user) {
		return userMapper.listUser(user);
	}

}
