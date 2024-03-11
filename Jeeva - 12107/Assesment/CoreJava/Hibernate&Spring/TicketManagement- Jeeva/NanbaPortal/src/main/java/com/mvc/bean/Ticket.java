package com.mvc.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Ticket {


	@Id
	private int ticketID;
	private String category;
	private String subject;
	private String descr;
	private String priority; 
	private String raisedBy;
	private String assignedTo;
	private String status;
	
	
	
	public Ticket() {
		super();
	}



	public Ticket(int ticketID, String category, String subject, String descr, String priority, String raisedBy,
			String assignedTo, String status) {
		super();
		this.ticketID = ticketID;
		this.category = category;
		this.subject = subject;
		this.descr = descr;
		this.priority = priority;
		this.raisedBy = raisedBy;
		this.assignedTo = assignedTo;
		this.status = status;
	}



	public int getTicketID() {
		return ticketID;
	}



	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getDescr() {
		return descr;
	}



	public void setDescr(String descr) {
		this.descr = descr;
	}



	public String getPriority() {
		return priority;
	}



	public void setPriority(String priority) {
		this.priority = priority;
	}



	public String getRaisedBy() {
		return raisedBy;
	}



	public void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
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
