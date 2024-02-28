package com.hibernate.day5.HQL1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@NamedQueries({
	
	@NamedQuery(
			name="findEmployeeById",
			query="from Employee e where e.eId=:eId" // like get parameter
	)
//	@NamedQuery(
//			name="findEmployeeByName",
//			query="from Employee e where e.eName=:eName" // like get parameter
//			),
//	@NamedQuery(
//			name="findEmployeeByDept",
//			query="from Employee e where e.eDept=:eDept" // like get parameter
//	)
	
})
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
