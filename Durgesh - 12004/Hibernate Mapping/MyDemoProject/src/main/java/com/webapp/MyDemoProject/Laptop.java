package com.webapp.MyDemoProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Laptop")
public class Laptop {
	
	@Id
	@Column(name= "Laptop_ID")
	private int lapId;
	@Column(name= "Laptop_Name")
	private String lapName;
	
	public Laptop() {
		super();
	}
	
	public Laptop(int lapId, String lapName) {
		super();
		this.lapId = lapId;
		this.lapName = lapName;
	}
	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
	public String getLapName() {
		return lapName;
	}
	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

	@Override
	public String toString() {
		return "Laptop [lapId=" + lapId + ", lapName=" + lapName + "]";
	}	
		
}
