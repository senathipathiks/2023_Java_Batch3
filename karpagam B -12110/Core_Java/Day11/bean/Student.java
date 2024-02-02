package com.stu_db.bean;

public class Student {
	private int id;
	private String name;
	private String Initial;
	
	public Student() {
		super();
	}
	

	public Student(int id, String name, String initial) {
		//super();
		this.id = id;
		this.name = name;
		Initial = initial;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getInitial() {
		return Initial;
	}


	public void setInitial(String initial) {
		Initial = initial;
	}


	public static void main(String[] args) {
		

	}



}
