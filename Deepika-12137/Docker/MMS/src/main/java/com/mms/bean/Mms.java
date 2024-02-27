package com.mms.bean;

public class Mms {
 private String movieName;
 private int screenNo;
 private int ticketId;
 
public Mms(String movieName, int screenNo, int ticketId) {
	super();
	this.movieName = movieName;
	this.screenNo = screenNo;
	this.ticketId = ticketId;
}

public Mms() {
	super();
}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public int getScreenNo() {
	return screenNo;
}

public void setScreenNo(int screenNo) {
	this.screenNo = screenNo;
}

public int getTicketId() {
	return ticketId;
}

public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}


}
 
 

