package com.lifecycle;

public class StudentLifecycle {

	private int studentId;
	private String studentName;
	private String studentCity;
		
	StudentLifecycle(){
		System.out.println("Bean Created");
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	private void init() {
	System.out.println("Iam InIt method");	
	}
	
	private void destroy() {
	System.out.println("Iam Destroy Method");
	}

	@Override
	public String toString() {
		return "StudentLifecycle [studentId=" + studentId + ", studentName=" + studentName + ", studentCity="
				+ studentCity + "]";
	}
	
	
}
