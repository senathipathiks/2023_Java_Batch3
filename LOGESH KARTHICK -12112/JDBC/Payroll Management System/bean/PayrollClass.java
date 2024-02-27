package com.ms.bean;

public class PayrollClass {

	int pid;
	String ename;
	int eid;
	float basic;
	int hra;
	int da;
	int ta;
	float ctc;

	public PayrollClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PayrollClass(int pid, String ename, int eid, float basic, int hra, int da, int ta, float ctc) {
		super();
		this.pid = pid;
		this.ename = ename;
		this.eid = eid;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.ta = ta;
		this.ctc = ctc;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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
