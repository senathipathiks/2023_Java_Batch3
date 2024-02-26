package com.hibernate.day2.Annotations;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	
	@Column(name="eName")
	private String eName;
	
	@Column(nullable = false)
	private String eDesig;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String eName, String eDesig) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDesig = eDesig;
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

	public String geteDesig() {
		return eDesig;
	}

	public void seteDesig(String eDesig) {
		this.eDesig = eDesig;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eDesig=" + eDesig + "]";
	}
	
	
	
}
