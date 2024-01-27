package Day_4;

import java.util.Scanner;

class Employee{
	 int empid;
	 String empname;
	
	
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	void Empdetails() {
		System.out.println("Employee id : "+empid);
		System.out.println("Employee name : "+empname);
	}
	
}

class Manager extends Employee{
	 String dept;
	public Manager(int empid, String empname,String dept) {
		super(empid, empname);
		this.empid = empid;
		this.empname = empname;
		this.dept=dept;
	}
	void Empdetails() {
		System.out.println("Employee id : "+empid);
		System.out.println("Employee name : "+empname);
		System.out.println("Manager of "+dept);
}

public class EmpMgr {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Employee \n2.Manager");
		int val=sc.nextInt();
		if(val==1) {
		System.out.println("Enter the employee id: ");
		int empid=sc.nextInt();
		System.out.println("Enter the employee name: ");
		String empname=sc.next();
		
		Employee emp=new Employee(empid, empname);
		
		switch (val) {
		case 1:
			emp.Empdetails();
			break;
		default:
			break;
		}

	}
		else if(val==2) {
			
			System.out.println("Enter employee id: ");
			int empid=sc.nextInt();
			System.out.println("Enter the employee name: ");
			String empname=sc.next();
			System.out.println("Enter department :");
			String dept=sc.next();
			
			Employee mgr=new Manager(empid, empname, dept);
			switch (val) {
			case 2:
				mgr.Empdetails();
				break;

			default:
				break;
			}
			}
		}

}
}
