package com.myspringmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myspringmvc.model.User;


@Service  
public interface UserService  {
	
	List<User> findAll(); 
}
