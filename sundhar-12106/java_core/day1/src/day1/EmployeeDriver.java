package day1;

class Employee{
	private int empID;
	private String empName;
	private String empDesig;
	private String gender;
	private double empSal;
	
	public Employee() {
		
	}
	public Employee(int empID, String empName,String empDesig, String gender, double empSal) {
		this.empID = empID;
		this.empName = empName;
		this.gender = gender;
		this.empSal = empSal;
		this.empDesig = empDesig;
	}
	
	public void displayEmployee() {
		System.out.println("Employee ID : "+empID);
		System.out.println("Employee name : "+empName);
		System.out.println("Employee designation : "+empDesig);
		System.out.println("Employee salary : "+empSal);
	}
	
	
}

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(201, "Sundhar Raj S","Developer", "male", 25000.78);
		
		e1.displayEmployee();
	}

}
