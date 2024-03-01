package com.day3.springExample.SpringAnnotationEg;

import org.springframework.stereotype.Component;

@Component
public class Parent {
	private String fatherName;
	private String motherName;
	
	
	public Parent() {
		super();
	}
	
	public Parent(String fatherName, String motherName) {
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
	public String getMotherName(String string) {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	@Override
	public String toString() {
		return "Parent [fatherName=" + fatherName + ", motherName=" + motherName + "]";
	}
	
	
	

}
