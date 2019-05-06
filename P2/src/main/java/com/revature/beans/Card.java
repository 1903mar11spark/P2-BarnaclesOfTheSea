package com.revature.beans;

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

@Entity
@Table(name="CARD")
public class Card {
	
	//constructors
	public Card() {
	}
	public Card(int id, String question, String answer, Topic topic) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.topic = topic;
	}
	public Card(String question, String answer, Topic topic) {
		super();
		this.question = question;
		this.answer = answer;
		this.topic = topic;
	}
	
	//instance variables 
	
	@Id //indicates primary key 
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "cardSequence")
	@SequenceGenerator(allocationSize=1, name="cardSequence", sequenceName="SQ_CARD_PK")
	@Column(name="CARDID")
	private int id; 
	
	@Column(name="QUESTION")
	private String question; 
	
	@Column(name="ANSWER")
	private String answer; 
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="TOPICID")
	private Topic topic; 
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	//toString
	@Override
	public String toString() {
		return "Card [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}

}
