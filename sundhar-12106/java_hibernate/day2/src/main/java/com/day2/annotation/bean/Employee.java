package com.day2.annotation.bean;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee1")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	@Column(nullable = false)
	private String eName;
	private String eDesig;
	private double esal;
	@Column(unique = true)
	private long ePhone;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee( String eName, String eDesig, double esal, long ePhone) {
		
		this.eName = eName;
		this.eDesig = eDesig;
		this.esal = esal;
		this.ePhone = ePhone;
	}



	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public long getePhone() {
		return ePhone;
	}

	public void setePhone(long ePhone) {
		this.ePhone = ePhone;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", eDesig=" + eDesig + ", esal=" + esal + ", ePhone="
				+ ePhone + "]";
	}

}
