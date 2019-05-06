package com.revature.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity // indicates that the class represents a DB entity
@Table(name ="USR")
public class User {

	//constructors
	public User() {
	}
	public User(int id, String firstName, String lastName, String email, UserType userType, LoginCreds loginCreds,
			int mentoredBy) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userType = userType;
		this.loginCreds = loginCreds;
		this.mentoredBy = mentoredBy;
	}
	public User(String firstName, String lastName, String email, UserType userType, LoginCreds loginCreds,
			int mentoredBy) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userType = userType;
		this.loginCreds = loginCreds;
		this.mentoredBy = mentoredBy;
	}
	public User(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	//instance variables 
	
	@Id //indicates primary key
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "usrSequence")
	@SequenceGenerator(allocationSize=1, name="usrSequence", sequenceName="SQ_USR_PK")
	@Column(name="USRID")
	private int id; 
	
	@Column(name="FIRSTNAME")
	private String firstName; 
	
	@Column(name="LASTNAME")
	private String lastName; 
	
	@Column(name="EMAIL")
	private String email; 
	
	@ManyToOne(fetch=FetchType.EAGER) //establishes FK relationship?
	@JoinColumn(name="USRTYPEID")
	private UserType userType; 
	
	@OneToOne //establishes FK relationship?
	@JoinColumn(name="LOGINCREDSID")
	private LoginCreds loginCreds;
	
	@Column(name="MENTOREDBY")
	private int mentoredBy;
	
	//getters and setters 
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public UserType getUserType() {
		return userType;
	}
	public LoginCreds getLoginCreds() {
		return loginCreds;
	}
	public int getMentoredBy() {
		return mentoredBy;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public void setLoginCreds(LoginCreds loginCreds) {
		this.loginCreds = loginCreds;
	}
	public void setMentoredBy(int mentoredBy) {
		this.mentoredBy = mentoredBy;
	}
	
	//toString
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mentoredBy=" + mentoredBy + "]";
	}

}
