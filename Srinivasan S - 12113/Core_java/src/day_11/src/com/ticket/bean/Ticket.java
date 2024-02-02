package com.ticket.bean;

public class Ticket {

	private int ticketId;
	private String desc;
	private int issuer;
	private String assignedTo;
	private String status;
	
	public Ticket(int ticketId, String desc, int issuer, String assignedTo,String status) {
		super();
		this.ticketId = ticketId;
		this.desc = desc;
		this.issuer = issuer;
		this.assignedTo = assignedTo;
		this.status=status;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getIssuer() {
		return issuer;
	}

	public void setIssuer(int issuer) {
		this.issuer = issuer;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
