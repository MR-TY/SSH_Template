package com.ty.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ty.dao.UserDao;
import com.ty.entity.User;

@Service
@Transactional
public class UserService {
	@Resource
	private UserDao userDao;

	public void save(User user) {
		userDao.save(user);
	}
}
