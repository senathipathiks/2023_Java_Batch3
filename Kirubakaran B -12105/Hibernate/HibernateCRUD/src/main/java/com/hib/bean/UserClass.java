package com.hib.bean;

public class UserClass {

	private int uid;
	private String uname;
	private String ucity;
	
	public UserClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserClass(int uid, String uname, String ucity) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.ucity = ucity;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUcity() {
		return ucity;
	}

	public void setUcity(String ucity) {
		this.ucity = ucity;
	}

	@Override
	public String toString() {
		return "UserClass [uid=" + uid + ", uname=" + uname + ", ucity=" + ucity + "]";
	}
	
	
	
}
