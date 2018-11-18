package com.tramp.item.service;

import java.util.List;

import com.tramp.item.pojo.UserDO;

public interface UserService {
	
	/**
	 * 保存user
	 * @param user
	 */
	void saveUser(UserDO user);
	
	/**
	 * 获取user集合
	 * @param user
	 * @return
	 */
	List<UserDO> listUser(UserDO user);

}
