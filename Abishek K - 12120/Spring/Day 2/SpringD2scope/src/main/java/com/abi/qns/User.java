package com.abi.qns;

public class User {
	
	
	private String uname;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String uname) {
		super();
		this.uname = uname;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + "]";
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	
	
	
	

}
