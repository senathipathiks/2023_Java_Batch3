package com.spring.day3.Annotations;

public class Person {
	private int pId;
	private String pName;


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}	
	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}



	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}


	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	
	
}
