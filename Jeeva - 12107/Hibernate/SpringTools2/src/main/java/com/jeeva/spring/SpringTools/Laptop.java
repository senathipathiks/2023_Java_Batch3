package com.jeeva.spring.SpringTools;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Laptop {

	@Id
	private int lId;
	private String lName;
	
	public Laptop() {
		super();
	}

	public Laptop(int lId, String lName) {
		super();
		this.lId = lId;
		this.lName = lName;
	}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lName=" + lName + "]";
	}
	
	
	
}
