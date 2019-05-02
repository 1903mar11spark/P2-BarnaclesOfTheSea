package com.revature.beans;

import java.sql.Time;
import java.sql.Date;

public class Event {
	
	private int eventId;
	private User user;
	private Date date;
	private Time time;
	private String event;
	private String eventName;
		
	public Event(int eventId, User user, Date date, Time time, String event, String eventName) {
		super();
		this.eventId = eventId;
		this.user = user;
		this.date = date;
		this.time = time;
		this.event = event;
		this.setEventName(eventName);
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", user=" + user + ", date=" + date + ", time=" + time + ", event=" + event
				+ ", eventName=" + eventName + "]";
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	
	

}
