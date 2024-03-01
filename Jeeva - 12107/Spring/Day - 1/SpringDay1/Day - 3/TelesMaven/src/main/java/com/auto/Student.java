package com.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	private int sId;
	private String sName;
	private String sCity;

	@Autowired
	private Parent pDeatils;

	public Student() {
		super();
	}

	public Student(int sId, String sName, String sCity) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sCity = sCity;
		
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	public Parent getDeatils() {
		return pDeatils;
	}

	public void setDeatils(Parent deatils) {
		this.pDeatils = deatils;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sCity=" + sCity ;
	}
	
	
	
}
