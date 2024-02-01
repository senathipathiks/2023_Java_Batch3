package com.exe.bean;

//This is model (in bean use getter and setter & constructor using super class &

public class EmployeeModel{
	private int id;
	private String name;
	
	public EmployeeModel() {
		super();
	}
	
	public EmployeeModel (int id, String name) {
		super();
		this.id = id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
}



public String getName() {
	// TODO Auto-generated method stub
	return name;
}
public void setName(String name) {
	this.name=name;
}
}
