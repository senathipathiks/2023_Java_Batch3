package com.jeeva.spring.SpringTools;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	private int eRoll;
	private String eName;
	// One To One Mapping 20nth the line 
	// Target Entity Optional One ---  Casecade Mantatry
	// CascadeType.ALL  means every operations will be refelec the leptop class or associated table
	@OneToOne(targetEntity=Laptop.class,cascade=CascadeType.ALL)
	// Referring lapclass primary key here
	@JoinColumn
	private Laptop l1;

	//
	
	public Employee() {
		super();
	}
	
	


	public Employee(int eRoll, String eName, Laptop l1) {
		super();
		this.eRoll = eRoll;
		this.eName = eName;
		this.l1 = l1;
	}


	public int geteRoll() {
		return eRoll;
	}


	public void seteRoll(int eRoll) {
		this.eRoll = eRoll;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public Laptop getL1() {
		return l1;
	}


	public void setL1(Laptop l1) {
		this.l1 = l1;
	}
	
	
	

}
