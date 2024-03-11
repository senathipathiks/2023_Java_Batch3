package com.abi.day3.SpringD3Annto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Exmp1 {
	
	private int sid;
	private String sname;
	private String scity;
	
	@Autowired
	private Parrent Details;

	public Exmp1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exmp1(int sid, String sname, String scity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public Parrent getDetails() {
		return Details;
	}

	public void setDetails(Parrent details) {
		Details = details;
	}

	@Override
	public String toString() {
		return "Exmp1 [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}
	
	

}
