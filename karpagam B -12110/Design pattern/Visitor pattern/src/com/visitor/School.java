package com.visitor;

import java.util.ArrayList;

class School {

	public static void doHealthCheckup() {

		Doctor doctor = new Doctor("Dr.Agarwal");
		ArrayList<Student> studentList = new ArrayList<Student>();

		Student karan = new Student("Karan");
		Student sathya = new Student("Sathya");
		Student kavi = new Student("Kavi");

		studentList.add(karan);
		studentList.add(sathya);
		studentList.add(kavi);
		
		for (Student student : studentList) {
			student.accept(doctor);
		}
	}

}