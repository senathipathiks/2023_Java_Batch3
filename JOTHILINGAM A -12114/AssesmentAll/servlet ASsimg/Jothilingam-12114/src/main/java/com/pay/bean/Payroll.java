package com.pay.bean;

public class Payroll {
	
	private int payRollID;
	private String employeeName;
	private int empId;
	private float basic;
	private int hra;
	private int da;
	private int ta;
	private float ctc;
	public Payroll(int payRollID, String employeeName, int emoId, float basic, int hra, int da, int ta, float ctc) {
		super();
		this.payRollID = payRollID;
		this.employeeName = employeeName;
		this.empId = emoId;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.ta = ta;
		this.ctc = ctc;
	}
	public int getPayRollID() {
		return payRollID;
	}
	public void setPayRollID(int payRollID) {
		this.payRollID = payRollID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int emoId) {
		this.empId = emoId;
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
