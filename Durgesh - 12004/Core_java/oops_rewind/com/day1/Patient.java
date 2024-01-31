package com.day1;

public class Patient {
	
	//these variables are accessed only by objects
	private int patID;
	private String patName;
	private int patAge;
	private String patGender;
	
	Patient(int patID, String patName, int patAge, String patGender) {
		this.patID=patID;
		this.patName=patName;
		this.patAge=patAge;
		this.patGender=patGender;
	}
	
	void displayPatient() {
		System.out.println("Patient ID: "+patID);
		System.out.println("Patient Name: "+patName);
		System.out.println("Patient Age: "+patAge);
		System.out.println("Patient Gender: "+patGender);
	}
	public static void main(String[] args) {
		Patient p1 = new Patient(1546, "Murugan", 56, "Male");
		p1.displayPatient();
	}

}
