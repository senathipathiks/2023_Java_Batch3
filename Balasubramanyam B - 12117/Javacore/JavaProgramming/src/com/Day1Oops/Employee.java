package com.Day1Oops;

public class Employee {
    private int empId;
    private String empName;
    private String email;
    private double salary;
    Employee(int empId,String empName,String email,double salary){
    	this.empId=empId;
    	this.empName=empName;
    	this.salary=salary;
    	this.email=email;
    }
    void displayEmployee() {
    	System.out.println("Employee Id: "+empId+"\nEmployee Name: "+empName+"\nEmployee email: "+email+"\nEmployee salary: "+salary);
    }
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Balasubramanyam","balasubramanip2002@gmail.com",16000.0);
		e1.displayEmployee();

	}

}
