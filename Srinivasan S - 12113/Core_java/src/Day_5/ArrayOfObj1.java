package Day_5;

import java.util.Scanner;

class Employee{
	int eid;
	String name;
	
	void showdata(int eid,String name) {
		this.eid=eid;
		this.name=name;
	}
	
	void empDetails() {
		System.out.println("Emp id : "+eid);
		System.out.println("Emp name : "+name);
	}
}

public class ArrayOfObj1  {
	 
	public static void main(String[] args) {
		Employee []emp=new Employee[2];
		int i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id and Employee name");
		
		for ( i = 0; i < emp.length; i++) {
			emp[i]=new Employee();
			 int id=sc.nextInt();
			 String nam=sc.next();
			 emp[i].showdata(id, nam);
		
		}
		System.out.println(i);
		for (Employee e: emp) {
			e.empDetails();
		}
		
		
		
	}

}
