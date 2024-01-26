package com.newclass;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String employeeDesign;
	private String employeeGen;
	private String bloodGroup;
	
	Employee(int employeeId,String employeeName,String employeeDesign,String employeeGen,String bloodGroup){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeDesign=employeeDesign;
		this.employeeGen=employeeGen;
		this.bloodGroup=bloodGroup;
		
		
	}
	
	void showEmployee() {
		
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Employee Designation :"+employeeDesign);
		System.out.println("Employee Gender :"+employeeGen);
		System.out.println("Employee BloodGroup :"+bloodGroup);
		
	}
	
	public static void main (String s[]) {
		
		Employee e = new Employee(12119,"Prashanth","Software Engg","Male","A+");
		
		e.showEmployee();
	}

}
