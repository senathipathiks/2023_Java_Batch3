package com.ticket_db.bean;

public class ticket {
	private int t_id;
	private String dept;
	private String issued_date;
	private String category;
	private String priority;
	private int phone_no;

	public ticket(int t_id, String dept, String issued_date, String category, String priority, int phone_no) {
		super();
		this.t_id = t_id;
		this.dept = dept;
		this.issued_date = issued_date;
		this.category = category;
		this.priority = priority;
		this.phone_no = phone_no;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getIssued_date() {
		return issued_date;
	}

	public void setIssued_date(String issued_date) {
		this.issued_date = issued_date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

}
