package com.hibernate.day5.HQL1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empdetail")
public class Employee {
	@Id
	private int eId;
	@Column(name="eName")
	private String eName;
	private int eDept;
	

	public Employee() {
		
	}


	public Employee(int eId, String eName, int eDept) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDept = eDept;
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


	public int geteDept() {
		return eDept;
	}


	public void seteDept(int i) {
		this.eDept = i;
	}


	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eDept=" + eDept + "]";
	}
	
}
