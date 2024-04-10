package com.btbs.bean;

public class Bus {

	
	private int ticketId;
	private String boarding;
	private String destination;
	private float price;
	private int noOfSeat;
	
	public Bus(int ticketId, String boarding, String destination, float price, int noOfSeat) {
		super();
		this.ticketId = ticketId;
		this.boarding = boarding;
		this.destination = destination;
		this.price = price;
		this.noOfSeat = noOfSeat;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getBoarding() {
		return boarding;
	}

	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNoOfSeat() {
		return noOfSeat;
	}

	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
	
	
	
}
