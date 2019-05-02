package com.revature.beans;

public class List {
	
	private int listId;
	private User user;
	private String listType;
	private String listName;
	
	
	public int getListId() {
		return listId;
	}
	public void setListId(int listId) {
		this.listId = listId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getListType() {
		return listType;
	}
	public void setListType(String listType) {
		this.listType = listType;
	}
	public String getListName() {
		return listName;
	}
	
	public void setListName(String listName) {
		this.listName = listName;
	}

	public List(int listId, User user, String listType, String listName) {
		super();
		this.listId = listId;
		this.user = user;
		this.listType = listType;
		this.listName = listName;
	}
	
	public List() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
