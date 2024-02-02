package com.hospital.bean;

public class Hospital {
	
	private int pid;
	private String pname;
	private int did;
	private String dname;
	
	public Hospital(int pid, String pname, int did, String dname) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.did = did;
		this.dname = dname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	
	
	
	
	
}
