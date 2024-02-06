package com.nanba.bean;

public class Nanba {
	
	private int ticket_id;
	private String category;
	private String subject;
	private String desc;
	private String priority;
	private String raised_by;
	private String assigned_to;
	private String  status;
	
	
	
	
	
	public Nanba(int ticket_id, String category, String subject, String desc, String priority, String raised_by,
			String assigned_to, String status) {
		
		this.ticket_id = ticket_id;
		this.category = category;
		this.subject = subject;
		this.desc = desc;
		this.priority = priority;
		this.raised_by = raised_by;
		this.assigned_to = assigned_to;
		this.status = status;
	}


	public int getTicket_id() {
		return ticket_id;
	}


	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
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

	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}


	public String getRaised_by() {
		return raised_by;
	}

	public void setRaised_by(String raised_by) {
		this.raised_by = raised_by;
	}

	public String getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
