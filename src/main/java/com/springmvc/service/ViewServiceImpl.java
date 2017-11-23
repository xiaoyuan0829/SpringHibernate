package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.UserDao;
import com.springmvc.model.User;

@Service
@Transactional
public class ViewServiceImpl implements ViewService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void addUserService(User user) {
		userDao.addUser(user);
	}

	@Override
	public List<User> queryUser() {
		return userDao.queryUser();
	}

	@Override
	public boolean delUser(Integer id) {
		return userDao.delUser(id);
	}

}
