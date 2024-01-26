package com.day1;

public class EmployeeDetails {

	private int empId;
	private String empName;
	private String empAddress;
	private String empGender;
	private String empEmail;
	private long empPhoneNO;
	
	EmployeeDetails(int empId,String empName,String empAddress,String empGender,String empEmail,long empPhoneNo){
		this.empId=empId;
		this.empName=empName;
		this.empAddress=empAddress;
		this.empGender=empGender;
		this.empEmail=empEmail;
		this.empPhoneNO=empPhoneNo;
	}
	
	void displayEmployeeDetails() {
		System.out.println("Employee Id:" + empId);
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee Address:" + empAddress);
		System.out.println("Employee Gender:" + empGender);
		System.out.println("Employee Email:" + empEmail);
		System.out.println("Employee Phone Number:" + empPhoneNO);
	}
	 
	public static void main(String arg[]) {
		EmployeeDetails E1=new EmployeeDetails(12126,"Vinolisha","Nagercoil","Female","vinolisha8@gmail.com",9150620420l);
		E1.displayEmployeeDetails();
	}
	

}
