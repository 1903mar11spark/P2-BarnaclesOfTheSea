package com.revature.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.DAO.CardDAO;
import com.revature.DAO.CardDAOImpl;
import com.revature.beans.Card;

@Service 
public class CarServiceImpl implements CardService {

	//instance variables 
	private CardDAO cd = new CardDAOImpl();
	
	//service methods 
	@Override
	public Card getCardById(int id) {
		return cd.getCardById(id); 
	}

	@Override
	public List<Card> getAllCards() {
		return cd.getAllCards(); 
	}

	@Override
	public void addCard(Card card) {
		cd.addCard(card);
	}

	@Override
	public boolean updateCard(Card card) {
		return cd.updateCard(card); 
	}

	@Override
	public void deleteCard(Card card) {
		cd.deleteCard(card);
	}

}
