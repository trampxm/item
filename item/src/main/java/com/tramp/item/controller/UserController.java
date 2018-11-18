package com.tramp.item.controller;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tramp.item.bean.XtyunResponse;
import com.tramp.item.pojo.UserDO;
import com.tramp.item.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	private AtomicInteger ai = new AtomicInteger();
	
	/**
	 * 保存用户
	 * @return
	 */
	@RequestMapping("/save")
	public XtyunResponse save() {
		XtyunResponse response = new XtyunResponse();
		UserDO userDO = new UserDO();
 		userDO.setAge(ai.addAndGet(1));
 		userDO.setUsername("黄药师");
		userDO.setNick("东邪");
		userDO.setBirthday(new Date());
		userService.saveUser(userDO);
		response.setMessage("ok");
		response.setStatus("200");
		return response;
	}
	
	@RequestMapping("/list")
	public XtyunResponse list() {
		XtyunResponse response = new XtyunResponse();
		UserDO user = new UserDO();
		List<UserDO> users = userService.listUser(user);
		for (UserDO userDO : users) {
			logger.info("select user:{}", userDO.toString());
		}
		response.setData(users);
		response.setMessage("ok");
		response.setStatus("200");
		return response;
	}
	
}
