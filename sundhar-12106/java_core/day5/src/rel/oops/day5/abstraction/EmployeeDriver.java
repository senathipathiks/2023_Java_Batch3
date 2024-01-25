package rel.oops.day5.abstraction;

import java.util.Iterator;
import java.util.Scanner;

class Employee{
	int empId;
	String empName;
	String designation;
	double esal;
	
	public Employee() {
		
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
		this.esal = esal;
	}
	
	void display() {
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Designation : "+designation);
		System.out.println("Employee Salary : "+esal);
	}
}

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee [] emp = new Employee[2];
		
		System.out.println("adding 3 employee");
		for (int i = 0; i < 2; i++) {

			System.out.println("enter emp id,name,desigantion,salary");
			emp[i] = new Employee();
			emp[i].setEmpId(sc.nextInt());
			emp[i].setEmpName(sc.nextLine());
			emp[i].setDesignation(sc.nextLine());
			sc.nextLine();
			emp[i].setEsal(sc.nextDouble());
			System.out.println(i+1 + "employee added");	
		}
		
		System.out.println("\t\t\tEmployee Details");
		for (Employee e : emp) {
			e.display();
			System.out.println("------------------------------");
		}

	}

}
