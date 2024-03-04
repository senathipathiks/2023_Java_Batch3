package com.annotation.autowire;

import org.springframework.stereotype.Component;

@Component
public class Parent {
	
	private String fathername;
	private String mothername;
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
