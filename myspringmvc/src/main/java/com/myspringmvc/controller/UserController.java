package com.myspringmvc.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myspringmvc.model.User;
import com.myspringmvc.service.UserService;

@Controller
public class UserController {
	private static final Logger LOGGER = Logger.getLogger(UserController.class);  
	
	@Autowired  
    private UserService userService;  
	
    @RequestMapping(value="/test", method = RequestMethod.GET)
    @ResponseBody
    public String testQuery() {  
    	try {
    		  List<User> user = userService.findAll();  
    	      LOGGER.info(user.toString());  
    	      return user.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
      return null;
    } 
    
    @RequestMapping(value="/test", method = RequestMethod.POST)
    @ResponseBody
    public List<User> testListQuery() {  
    	try {
    		  List<User> user = userService.findAll();  
    	      LOGGER.info(user.toString());  
    	      return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
      return null;
    } 
}