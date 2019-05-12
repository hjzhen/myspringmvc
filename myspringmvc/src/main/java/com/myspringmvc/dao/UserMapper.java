package com.myspringmvc.dao;

import java.util.List;

import com.myspringmvc.model.User;


public interface UserMapper {
	List<User> findAll(); 
}
