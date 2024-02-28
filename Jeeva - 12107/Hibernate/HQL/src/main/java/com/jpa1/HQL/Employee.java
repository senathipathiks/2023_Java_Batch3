package com.jpa1.HQL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmpDetail")
public class Employee {

	@Id	
	private int eId;	
	private String eName;
	private int eDeptNo;
	
	public Employee() {
		
	}
	
	public Employee(int eId, String eName, int eDeptNo) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDeptNo = eDeptNo;
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

	public int geteDeptNo() {
		return eDeptNo;
	}

	public void seteDeptNo(int eDeptNo) {
		this.eDeptNo = eDeptNo;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eDeptNo=" + eDeptNo + "]";
	}
	
	
	
}
