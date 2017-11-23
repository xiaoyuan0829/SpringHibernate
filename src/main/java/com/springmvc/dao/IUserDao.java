package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.User;

public interface IUserDao {

	public void addUser(User user);
	
	public List<User> queryUser();
	
	public boolean delUser(Integer id);
}
