package com.revature.DAO;

import java.util.List;

import com.revature.beans.UserCard;


public interface UserCardDAO {

	public List<UserCard> getAllUserCards(); 
	
	public void addUserCard(UserCard userCard); 
	
	public boolean updateUserCard(UserCard userCard); 
	
	public void deleteUserCard(UserCard userCard); 
}
