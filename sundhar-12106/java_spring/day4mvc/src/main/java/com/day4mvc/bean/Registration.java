package com.day4mvc.bean;


public class Registration {

	
	private int id;
//	@Column(nullable = false)
	private String fName;
	private String lName;
//	@Column(nullable = false)
	private long phoneNo;

	public Registration() {
		// TODO Auto-generated constructor stub
	}

	public Registration(int id, String fName, String lName, long phoneNo) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", fName=" + fName + ", lName=" + lName + ", phoneNo=" + phoneNo + "]";
	}

}
