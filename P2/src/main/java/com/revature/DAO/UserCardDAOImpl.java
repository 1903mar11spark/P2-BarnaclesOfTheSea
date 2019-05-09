package com.revature.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

//import com.revature.beans.UserCard;
import com.revature.util.ConnectionUtil;

public class UserCardDAOImpl implements UserCardDAO {

//	// variables
//	private SessionFactory sf = ConnectionUtil.getSessionFactory();
//
//	// methods
//
//	@Override
//	public List<UserCard> getAllUserCards() {
//		List<UserCard> userCards = new ArrayList<>();
//		// use a Query to retrieve all UserCards
//		try (Session s = sf.getCurrentSession()) {
//			Transaction tx = s.beginTransaction();
//			userCards = s.createQuery("from UserCard").getResultList();
//			tx.commit();
//			s.close();
//		}
//		return userCards;
//	}
//
//	@Override
//	public boolean updateUserCard(UserCard userCard) {
//		// this is awesome. We use session and the hibernate methods here
//		// and NOT JDBC's connection and other interfaces.
//		try (Session s = sf.getCurrentSession()) {
//			Transaction tx = s.beginTransaction();
//			s.update(userCard);
//			tx.commit();
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//
//	}
//
//	@Override
//	public void addUserCard(UserCard userCard) {
//		try (Session s = sf.getCurrentSession()) {
//			Transaction tx = s.beginTransaction();
//			s.persist(userCard);
//			tx.commit();
//			s.close();
//		}
//	}
//
//	@Override
//	public void deleteUserCard(UserCard userCard) {
//		try (Session s = sf.getCurrentSession()) {
//			Transaction tx = s.beginTransaction();
//			s.delete(userCard);
//			tx.commit();
//			s.close();
//		}
//	}

}
