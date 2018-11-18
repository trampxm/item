package com.tramp.item.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserDO {
	
	private Integer id;
	private String username;
	private String nick;
	private Integer age;
//	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:SS")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date birthday;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "UserDO [id=" + id + ", username=" + username + ", nick=" + nick + ", age=" + age + ", birthday="
				+ birthday + "]";
	}
	
}
