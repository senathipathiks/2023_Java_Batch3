package com.assosiate.hiber.HiberMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LaptopBean")
public class LaptopBean {
	
	@Id
	private int lid;
	private String lname;
	
	public LaptopBean() {
		super();
	}

	public LaptopBean(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "LaptopBean [lid=" + lid + ", lname=" + lname + "]";
	}
	
	
	

}
