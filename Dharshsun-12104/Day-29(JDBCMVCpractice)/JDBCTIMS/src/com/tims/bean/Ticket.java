package com.tims.bean;

public class Ticket {
	private int ticketid;
	private int deptno;
	private String category;
	private String Priority;
	private int phoneno;
	
	public Ticket() {
		super();
	}

	public Ticket(int ticketid, int deptno, String category, String priority, int phoneno) {
		super();
		this.ticketid = ticketid;
		this.deptno = deptno;
		this.category = category;
		Priority = priority;
		this.phoneno = phoneno;
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPriority() {
		return Priority;
	}

	public void setPriority(String priority) {
		Priority = priority;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	
}
