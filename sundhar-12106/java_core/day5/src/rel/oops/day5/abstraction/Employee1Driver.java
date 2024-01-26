package rel.oops.day5.abstraction;

abstract class Employee1 {

	int empId;
	String empName;
	String designation;
	double payPerDay;

	public Employee1() {

	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setEsal(double esal) {
		this.payPerDay = esal;
	}

	void display() {
		System.out.println("Employee ID : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Designation : " + designation);
		System.out.println("Employee Salary : " + payPerDay);
	}

	abstract void calcSalary();

}

class Contract extends Employee1 {

	int days;

	public Contract(int id, String name, String desig, double sal, int days) {

		super.setEmpId(id);
		super.setEmpName(name);
		super.setDesignation(desig);
		super.setEsal(sal);
		this.days = days;

	}

	@Override
	void calcSalary() {
		System.out.println("salary for the contract employee is : " + (days * payPerDay));

	}

}

class FullTime extends Employee1 {

	int days;

	public FullTime(int id, String name, String desig, double sal, int days) {

		super.setEmpId(id);
		super.setEmpName(name);
		super.setDesignation(desig);
		super.setEsal(sal);
		this.days = days;

	}

	@Override
	void calcSalary() {
		System.out.println("salary for the full-time employee is : " + (days * payPerDay));

	}

}

public class Employee1Driver {
	
	public static void main(String[] args) {
		
		Employee1 ce = new Contract(101, "srinivasan", "developer", 1500.00, 30);
		Employee1 fe = new FullTime(201, "Sundhar Raj", "Test Engineer", 2000.00, 25);
		
		ce.calcSalary();
		fe.calcSalary();
	}

}
