package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.User;
import com.revature.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	//instance variables 
	private UserService us; 
	
	
	@Autowired // setter injection
	public void setUserService(UserService us) {
		this.us = us;
	}
	
	//methods
	@CrossOrigin(origins = "http://localhost:4203")
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<>(us.getAllUsers(), HttpStatus.OK);
	}

}
