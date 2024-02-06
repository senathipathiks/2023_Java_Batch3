package com.iniapro.bean;

public class IniaPro {
	
	private int ticketId;
	private String issuer;
	private String desc;
	private String assinedTo;
	private String status;
	
	
	
	public IniaPro(int ticketId, String issuer, String desc, String assinedTo, String status) {
		
		this.ticketId = ticketId;
		this.issuer = issuer;
		this.desc = desc;
		this.assinedTo = assinedTo;
		this.status = status;
	}



	public int getTicketId() {
		return ticketId;
	}



	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}



	public String getIssuer() {
		return issuer;
	}



	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}



	public String getDesc() {
		return desc;
	}



	public void setDesc(String desc) {
		this.desc = desc;
	}



	public String getAssinedTo() {
		return assinedTo;
	}



	public void setAssinedTo(String assinedTo) {
		this.assinedTo = assinedTo;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	

}
