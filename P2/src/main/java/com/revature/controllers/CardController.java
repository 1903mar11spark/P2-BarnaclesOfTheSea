package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Card;
import com.revature.service.CardService;

@RestController
@RequestMapping(value="/card")
public class CardController {
	
	//instance variables 
	private CardService cs; 

	@Autowired // setter injection
	public void setCardService(CardService cs) {
		this.cs = cs;
	}
	
	//methods
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Card>> getAllUsers() {
		return new ResponseEntity<>(cs.getAllCards(), HttpStatus.OK);
	}
	
}
