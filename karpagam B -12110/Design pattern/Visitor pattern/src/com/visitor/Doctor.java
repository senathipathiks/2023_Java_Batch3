package com.visitor;

//Implementation of Visitor Interface
public class Doctor implements Visitor {

	private String nameOfDoctor;

	//argument constructor
	public Doctor(String nameOfDoctor) {
		super();
		this.nameOfDoctor = nameOfDoctor;
	}
    //getter and setter
	public String getNameOfDoctor() {
		return nameOfDoctor;
	}

	public void setNameOfDoctor(String nameOfDoctor) {
		this.nameOfDoctor = nameOfDoctor;
	}

	//here we override method accept()
	@Override
	public void visit(Visitable visitable) {
		Student student = (Student) visitable;
		Student std=(Student)visitable;
		student.setHealthStatus("GOOD");
		std.setHealthStatus("Bad");
		
		System.out.println("Doctor: '" + this.getNameOfDoctor() + "' does the checkup of the student: '"
				+ student.getNameOfStudent()
				+ "' and Reported health is not good so updated the health status as " +std.getHealthStatus());

	}

}