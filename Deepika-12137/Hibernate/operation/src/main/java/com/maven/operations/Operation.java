package com.maven.operations;

public class Operation {


	private int ticketId;
	private String movieName;
	private int screenNo;
	public Operation(int ticketId, String movieName, int screenNo) {
		super();
		this.ticketId = ticketId;
		this.movieName = movieName;
		this.screenNo = screenNo;
	}
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
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
	 
}
