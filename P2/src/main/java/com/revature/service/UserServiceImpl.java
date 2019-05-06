package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.DAO.UserDAO;
import com.revature.DAO.UserDAOImpl;
import com.revature.beans.User;

@Service
public class UserServiceImpl implements UserService {

	//instance variables 

	private UserDAO ud = new UserDAOImpl();
	
	//methods
	public User getUserById(int id) {
		return ud.getUserById(id); 
	}
	
	public List<User> getAllUsers() {
		return ud.getAllUsers(); 
	}
	
	public void addUser(User user) {
		ud.addUser(user);
	}
	
	public boolean updateUser(User user) {
		return ud.updateUser(user); 
	}
	
	public void deleteUser(User user) {
		ud.deleteUser(user);
	}
	
}
