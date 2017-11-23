package com.springmvc.service;

import java.util.List;

import com.springmvc.model.User;

public interface ViewService {
	
	public void addUserService(User user);
	
	public List<User> queryUser();

	public boolean delUser(Integer id);
}
