package day_10;

import java.util.LinkedList;
import java.util.Scanner;

class Employee{
	int empId;
	String empName,empCity;
	
	public Employee(int empId, String empName, String empCity) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + "]";
	}
	
}

public class CRUDoperation {

	public static void main(String[] args) {
		LinkedList<Employee>list=new LinkedList<Employee>();
		
		Scanner sc=new Scanner(System.in);
		int id=0,msg=0;
		String name="",city="";
		boolean flag=false;
		
		do {
			System.out.println("1.Add Employee\n2.Find Employee\n3.Update Employee\n4.Delete Employee\n5.View All Employee");
			int opt = sc.nextInt();
			
			switch (opt) {
			case 1:
				System.out.println("Enter Id of the Employee");
				id=sc.nextInt();
				System.out.println("Enter name of the Employee");
				name=sc.next();
				System.out.println("Enter city of the Employee");
				city=sc.next();
				
				Employee emp=new Employee(id, name, city);
				list.add(emp);
				System.out.println("Record added successfully");
				break;
				
			case 2:
				System.out.println("Enter Id of the Employee");
				id=sc.nextInt();
				for(Employee e:list) {
					if(e.empId==id) {
						System.out.println(e.toString());
						flag=true;
						System.out.println("Record found successfully");
						break;
					}
				}
				if(flag==false) {
					System.out.println("Record not found");
				}
				break;
				
			case 3:
				System.out.println("Enter Id of the Employee");
				id=sc.nextInt();
				System.out.println("Enter name of the Employee");
				name=sc.next();
				System.out.println("Enter city of the Employee");
				city=sc.next();
				int index=0;
				Employee emp1=new Employee(id, name, city);
				for(Employee e:list) {
					if(e.empId==id) {
						
						list.set(index, emp1);
						System.out.println("Updated successfully");
						flag=true;
						break;
					}
					index ++;
				}
				if(flag==false) {
					System.out.println("Updation failed");
				}
				break;
				
			case 4:
				System.out.println("Enter Id of Employee");
				id=sc.nextInt();
				index=0;
				for (Employee e: list) {
					if(e.empId==id) {
						list.remove(index);	
						flag=true;
						System.out.println("Record deletion successfull");
						break;
					}	
					index ++;
				}
				if(flag==false) {
					System.out.println("Deletion failed");
				}
				break;
				
			case 5:
				System.out.println("Records of Employees ");
				
				for (Employee e : list) {
					System.out.println(e.toString());
				}
				break;

			default:
				break;
			}
			System.out.println("Want to continue \n1.Yes\n2.No");
			msg=sc.nextInt();
		} while (msg==1);
		System.out.println("Thank You !");
		
	}

}
