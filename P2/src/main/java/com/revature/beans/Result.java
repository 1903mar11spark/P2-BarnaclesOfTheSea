package com.revature.beans;

public class Result {

	//instance variables 
	int id; 
	String resultName; 
	
	//constructors 
	public Result() {
	}
	public Result(int id, String resultName) {
		super();
		this.id = id;
		this.resultName = resultName;
	}
	
	//getters and setters 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResultName() {
		return resultName;
	}
	public void setResultName(String resultName) {
		this.resultName = resultName;
	}
	
	//toString 
	@Override
	public String toString() {
		return "Result [id=" + id + ", resultName=" + resultName + "]";
	}
	

}
