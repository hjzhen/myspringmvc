package com.myspringmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspringmvc.dao.UserMapper;
import com.myspringmvc.model.User;
import com.myspringmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired  
	private UserMapper userMapper; 
	  
	public List<User> findAll() {
		return userMapper.findAll();
	}
}
