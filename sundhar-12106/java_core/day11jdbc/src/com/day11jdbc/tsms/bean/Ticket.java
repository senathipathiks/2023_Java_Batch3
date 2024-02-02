package com.day11jdbc.tsms.bean;

public class Ticket {

	/*
	 * Creating a bean class for the table to store thea data in the database.
	 * 
	 */

	private int tid;
	private String dept;
	private String tCatergory;
	private String tDesc;
	private String tStatus;
	private long mobNo;

	public Ticket() {

	}

	public Ticket(int tid, String dept, String tCatergory, String tDesc, String tStatus, long mobNo) {

		this.tid = tid;
		this.dept = dept;
		this.tCatergory = tCatergory;
		this.tDesc = tDesc;
		this.tStatus = tStatus;
		this.mobNo = mobNo;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String gettCatergory() {
		return tCatergory;
	}

	public void settCatergory(String tCatergory) {
		this.tCatergory = tCatergory;
	}

	public String gettDesc() {
		return tDesc;
	}

	public void settDesc(String tDesc) {
		this.tDesc = tDesc;
	}

	public String gettStatus() {
		return tStatus;
	}

	public void settStatus(String tStatus) {
		this.tStatus = tStatus;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

}
