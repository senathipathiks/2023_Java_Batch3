package com.visitor;

//Implementation of Visitable Interface
public class Student implements Visitable {

	private String nameOfStudent;

	private String healthStatus;

    //argument constructor
	public Student(String nameOfStudent) {
		super();
		this.nameOfStudent = nameOfStudent;
	}

	//getters and setters
	public String getNameOfStudent() {
		return nameOfStudent;
	}

	public void setNameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	// here we override method visit()
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}