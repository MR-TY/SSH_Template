package com.ty.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ty.entity.User;

@Repository
public class UserDao {
	@Resource
	private SessionFactory sessionFactory;
	
	public void save(User user){
		sessionFactory.openSession().save(user);
	}
}
