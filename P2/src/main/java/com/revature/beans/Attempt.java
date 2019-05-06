package com.revature.beans;

public class Attempt {

	//instance variables 
	int id; 
	int userId; 
	int cardId; 
	int resultId; 
	
	//constructors 
	public Attempt() {
	}
	public Attempt(int id, int userId, int cardId, int resultId) {
		super();
		this.id = id;
		this.userId = userId;
		this.cardId = cardId;
		this.resultId = resultId;
	}
	
	//getters and setters 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	
	//toString
	@Override
	public String toString() {
		return "Attempt [id=" + id + ", userId=" + userId + ", cardId=" + cardId + ", resultId=" + resultId + "]";
	}
	
	

}
