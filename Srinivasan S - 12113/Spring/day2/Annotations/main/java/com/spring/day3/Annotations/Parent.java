package com.spring.day3.Annotations;

import org.springframework.stereotype.Component;

@Component
public class Parent {
	
	private String fathername;
	private String mothername;

	public Parent() {
		// TODO Auto-generated constructor stub
	}
	
	public Parent(String fathername, String mothername) {
		super();
		this.fathername = fathername;
		this.mothername = mothername;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	@Override
	public String toString() {
		return "Parent [fathername=" + fathername + ", mothername=" + mothername + "]";
	}
	
	
	

}
