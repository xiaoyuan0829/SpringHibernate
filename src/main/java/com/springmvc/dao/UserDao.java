package com.springmvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.model.User;

@Repository
public class UserDao implements IUserDao{

	@Autowired
	SessionFactory sessionFactory;
	
	private Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addUser(User user) {
		getSession().save(user);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> queryUser() {
		String hql = "from User";
		return getSession().createQuery(hql).list();
	}

	@Override
	public boolean delUser(Integer id) {
		String hql = "delete from User where id = ?";
		Query query = getSession().createQuery(hql);
		query.setParameter(0, id);
		int count = query.executeUpdate();
		return count > 0;
	}

}
