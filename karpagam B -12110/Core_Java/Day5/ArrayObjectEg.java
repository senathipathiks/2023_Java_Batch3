package Com.Day5;

import java.util.Scanner;

class Employee{
	int eNo;
	String name;
	Employee(){}
	
	void getdata(int no,String nam) {
		eNo=no;
		name=nam;
		}
	void display() {
		System.out.println("Employee_No:"+eNo);
		System.out.println("Employee_Name:"+name);
}
}
public class ArrayObjectEg {

	public static void main(String[] args) {
		
		Employee[] obj1=new Employee[10];// we set array limit as 10
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			obj1[i]=new Employee();
			System.out.println("Enter employee No:");
			int n=sc.nextInt();
			System.out.println("Enter employee Name:");
			String fn=sc.next();
			obj1[i].getdata(n, fn);
					}
		for(int i=0;i<3;i++) {// displaying the data
			obj1[i].display();
		}
	}
	}


