package com.day3.Annotations.SpringAnnotationssena;

public class Person {

	int pid;
	String pname;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
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

	@Override
	public String toString() {
		return "Person [Person id=" + pid + ", pname=" + pname + "]";
	}
	

}
