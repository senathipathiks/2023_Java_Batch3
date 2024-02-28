package com.day4.Mapping.ManytoMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Answer")

public class Answer {
	@Id
	private int Aid;
	private String Aname;
	
	public Answer() {
		super();
		
	}
	
	public Answer(int aid, String aname) {
		super();
		Aid = aid;
		Aname = aname;
	}

	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	
	
	
	
	
	
	

}
