package com.springreactmicro.springreactmicro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springreactmicro.springreactmicro.model.User;
import com.springreactmicro.springreactmicro.repo.UserManagement;
@Service
public class UserManagementServiceImpl implements UserManagmentService {
	@Autowired
	UserManagement usermanment;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return usermanment.save(user);
	}

}
