package com.sample.inheritance3;

import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
	private String eName;
	public Employee() {
		
	}
	public Employee(int eId, String eName) {
		this.eId = eId;
		this.eName = eName;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}

}
