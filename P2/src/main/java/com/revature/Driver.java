package com.revature;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.DAO.CardDAO;
import com.revature.DAO.CardDAOImpl;
import com.revature.DAO.CardStateDAO;
import com.revature.DAO.CardStateDAOImpl;
import com.revature.DAO.LoginCredsDAO;
import com.revature.DAO.LoginCredsDAOImpl;
import com.revature.DAO.TopicDAO;
import com.revature.DAO.TopicDAOImpl;
import com.revature.DAO.UserCardDAO;
import com.revature.DAO.UserCardDAOImpl;
import com.revature.DAO.UserDAO;
import com.revature.DAO.UserDAOImpl;
import com.revature.DAO.UserTypeDAO;
import com.revature.DAO.UserTypeDAOImpl;
import com.revature.beans.Card;
import com.revature.beans.CardState;
import com.revature.beans.LoginCreds;
import com.revature.beans.Topic;
import com.revature.beans.User;
import com.revature.beans.UserType;
import com.revature.service.UserService;
import com.revature.service.UserServiceImpl;
import com.revature.util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		
		//testing connection
		
		SessionFactory sf = ConnectionUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		System.out.println(s.getStatistics());
		tx.commit();
		s.close();
		
		//testing persisting data 
		
		//users
		 
		/*
		CardDAO cd = new CardDAOImpl(); 
		*/
		
		
		//userTypes 
		
		UserTypeDAO utd = new UserTypeDAOImpl(); 
		
		
		//user types 
		/*
		UserType ut1 = new UserType(1, "learner"); 
		UserType ut2 = new UserType(2, "mentor");
		
		utd.addUserType(ut1);
		utd.addUserType(ut2);
		*/
		
		//login creds 
		//set of creds for first user 
		//this works to persist a set of login credis in DB
		//
		LoginCredsDAO lcd = new LoginCredsDAOImpl(); 
		
		/*
		LoginCreds lg1 = new LoginCreds("FFlower", "fanciful"); 
		lcd.addLoginCreds(lg1);
		LoginCreds lg1 = new LoginCreds("JJones", "juniper"); 
		lcd.addLoginCreds(lg1);
		LoginCreds lg1 = new LoginCreds("SSmith", "secret"); 
		lcd.addLoginCreds(lg1);
		*/
		
		//users 
		//
		
		UserDAO ud = new UserDAOImpl();
		
//		System.out.println(ud.getUserById(10));
		//pull user types from DB
		/*
		UserType learner = utd.getUserTypeById(1); 
		UserType mentor = utd.getUserTypeById(2); 
		*/
		
		//pull login creds from DB 
		/*
		LoginCreds lc1 = lcd.getLoginCredsById(1); 
		LoginCreds lc2 = lcd.getLoginCredsById(2);  
		LoginCreds lc3 = lcd.getLoginCredsById(3);  
		*/
		
		//generate users in java 
		/*
		User u1 = new User("Francis", "Flower", "FFlower@futuretech.com"); 
		User u2 = new User("John", "Jones", "JJones@futuretech.com"); 
		User u3 = new User("Sandy", "Smith", "SSmith@futuretech.com"); 
		*/
		
		//set usertype, login creds, add to DB 
		/*
		u1.setUserType(learner);
		u1.setLoginCreds(lc1);	
		ud.addUser(u1);
		*/
		
		/*
		u2.setUserType(learner);
		u2.setLoginCreds(lc2);	
		ud.addUser(u2);
		*/
		
		/*
		u3.setUserType(learner);
		u3.setLoginCreds(lc3);	
		ud.addUser(u3);
		*/
		
		//tests for create a user method 
		/*
		User u = new User(71, "Stu", "Stevens", "SStevens@futuretech.com",new UserType(2, "mentor"), new LoginCreds(0, "SStevens", "secret"), 0);
	 
		System.out.println(u);
		
		//start session 
		SessionFactory sf2 = ConnectionUtil.getSessionFactory();
		Session s2 = sf.openSession();
		Transaction tx2 = s2.beginTransaction();
		
		//persist login creds to DB
		s2.save(u.getLoginCreds()); 
		
		System.out.println(u.getLoginCreds().getId());
		
		//grab id to session 
		int userLoginCredsId = u.getLoginCreds().getId(); 
		
		//
		UserType userType = utd.getUserTypeById(u.getUserType().getId()); 
		
		User u2 = new User(u.getFirstName(), u.getLastName(), u.getEmail()); 
		
		//u2.setLoginCreds(lcd.getLoginCredsById(userLoginCredsId));
		u2.setLoginCreds(u.getLoginCreds());
		System.out.println();
		u2.setUserType(userType);
		
		System.out.println(u2);
		
		s2.persist(u2);
		
		//close 
		tx2.commit();
		s2.close();
		*/
	
		
		
		
		//cards 
		
		//topics 
		
		TopicDAO td = new TopicDAOImpl(); 
		
		/*
		Topic t1 = new Topic("Technology"); 
		Topic t2 = new Topic("Mathematics");
		Topic t3 = new Topic("Geography");
		td.addTopic(t1);
		td.addTopic(t2);
		td.addTopic(t3);
		*/
		
		//cards 
		/*
		Topic tech = td.getTopicById(1); 
		Topic math = td.getTopicById(2);
		Topic geo = td.getTopicById(3);
		*/
		
		CardDAO cd = new CardDAOImpl(); 
		
		/*
		Card c1 = new Card("What is the only integer that is neither postive nor neative?", "Zero", math); 
		Card c2 = new Card("What is the only prime number that is even?", "Two", math); 
		Card c3 = new Card("what is used to denote the relationship betwewen the circumference of a circle and its diameter?", "Pi", math); 
		cd.addCard(c1);
		cd.addCard(c2);
		cd.addCard(c3);
		*/
		
		/*
		Card c1 = new Card("What is the capital city of NY State?", "Albany", geo); 
		Card c2 = new Card("What is the capital district of the U.S.?", "Washington, D.C.", geo); 
		Card c3 = new Card("What is the capital district of Mexico?", "The Federal District", geo);
		cd.addCard(c1);
		cd.addCard(c2);
		cd.addCard(c3);
		*/
		/*
		Card c1 = new Card("Who invented the digital computer?", "J.V. Atanasoff", tech); 
		Card c2 = new Card("What does OOP, coffee and S.E. Asia have in common?", "Java", tech); 
		Card c3 = new Card("What is a long-standing coding technology for recording communicaton", "writing", tech);
		cd.addCard(c1);
		cd.addCard(c2);
		cd.addCard(c3);
		*/
		
		
		//testing some service methods 
		/*
		UserService us = new UserServiceImpl(); 
		System.out.println(us.getUserById(68)); 
		*/
		
		//test pulling all users with service 
		/*
		List<User> userList = us.getAllUsers(); 
		for (User u: userList) {
			System.out.println(u);
		}
		*/
		
		//persist some card states 
		CardStateDAO csd = new CardStateDAOImpl(); 
//		
//		CardState learning = new CardState(1, "learning"); 
		//CardState mastered = new CardState(2, "mastered"); 
//		System.out.println(learning); 
//		
//		csd.addCardState(learning);
		//csd.addCardState(mastered);
		
		
		//working with the USR_CARD table 
		
	
		
		UserCardDAO ucd = new UserCardDAOImpl(); 
		
		
		//User u = ud.getUserById(70); 
		
		//Card c = cd.getCardById(5); 
		
		
		
		
	}
}
