package com.revature.beans;
/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity // indicates that the class represents a DB entity
@Table(name ="USR_CARD")
public class UserCard {
	
	//constructors
	public UserCard() {
	}
	public UserCard(int id, User user, Card card, CardState cardState) {
		super();
		this.id = id;
		this.user = user;
		this.card = card;
		this.cardState = cardState;
	}

	//instance variables
	@Id //indicates primary key 
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "userCardSequence")
	@SequenceGenerator(allocationSize=1, name="userCardSequence", sequenceName="SQ_USR_CARD_PK")
	@Column(name="USR_CARDID")
	int id; 
	
	@Column(name="USRID")
	User user; 
	
	@Column(name="CARDID")
	Card card; 
	
	@ManyToOne(fetch=FetchType.EAGER) 
	@JoinColumn(name="CARDSTATEID")
	CardState cardState;

	//getters and setters
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public CardState getCardState() {
		return cardState;
	}
	public void setCardState(CardState cardState) {
		this.cardState = cardState;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//toString
	@Override
	public String toString() {
		return "UserCard [id=" + id + ", user=" + user + ", card=" + card + ", cardState=" + cardState + "]";
	}

}
*/