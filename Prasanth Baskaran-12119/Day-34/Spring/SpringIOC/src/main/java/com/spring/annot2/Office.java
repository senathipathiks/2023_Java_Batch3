package com.spring.annot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Office {
	
	private int offid;
	private String offname;
	
	
	
	
	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Office(int offid, String offname) {
		super();
		this.offid = offid;
		this.offname = offname;
	}
	public int getOffid() {
		return offid;
	}
	public void setOffid(int offid) {
		this.offid = offid;
	}
	public String getOffname() {
		return offname;
	}
	public void setOffname(String offname) {
		this.offname = offname;
	}
	@Override
	public String toString() {
		return "Office [offid=" + offid + ", offname=" + offname + "]";
	}
	
	

}
