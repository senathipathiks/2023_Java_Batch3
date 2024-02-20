package com.pms.bean;

public class Playroll {

	private int rollId;
	private String empName;
	private int empId;
	private float basic;
	private int hra;
	private int da;
	private int ta;
	private float ctc;
	
	
	public Playroll() {
		super();
	}


	public Playroll(int rollId, String empName, int empId, float basic, int hra, int da, int ta, float ctc) {
		super();
		this.rollId = rollId;
		this.empName = empName;
		this.empId = empId;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.ta = ta;
		this.ctc = ctc;
	}


	public int getRollId() {
		return rollId;
	}


	public void setRollId(int rollId) {
		this.rollId = rollId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public float getBasic() {
		return basic;
	}


	public void setBasic(float basic) {
		this.basic = basic;
	}


	public int getHra() {
		return hra;
	}


	public void setHra(int hra) {
		this.hra = hra;
	}


	public int getDa() {
		return da;
	}


	public void setDa(int da) {
		this.da = da;
	}


	public int getTa() {
		return ta;
	}


	public void setTa(int ta) {
		this.ta = ta;
	}


	public float getCtc() {
		return ctc;
	}


	public void setCtc(float ctc) {
		this.ctc = ctc;
	}
	
	
	
	}



