package com.abi.day3.SpringD3Annto;

import org.springframework.stereotype.Component;

@Component
public class Parrent {
	
	private String fatherName;
	private String motherName;
	public Parrent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parrent(String fatherName, String motherName) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@Override
	public String toString() {
		return "Parrent [fatherName=" + fatherName + ", motherName=" + motherName + "]";
	}
	
	
	
	

}
