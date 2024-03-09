package com.practice.bean;

public class Employee {

	private int eId;
	private String eName;
	private String eDesig;
	
	public Employee() {
		super();
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
