package day2oops;

import java.util.Scanner;

class Employee{
	int empno;
	String name;
	Employee(){
		
	}
	public void getdata(int no,String nam) {
		empno=no;
		name=nam;
	}
	void display() {
		System.out.println("Empno: "+empno);
		System.out.println("Name :"+name);
	}
	
}
public class ArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee []emp=new Employee[10];
//		String fn=new String();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			emp[i]=new Employee();
			System.out.println("Enter employee number");
			int n=sc.nextInt();
			System.out.println("Enter Employee Name  ");
			String fn=sc.next();
			emp[i].getdata(n,fn);
		}
		for(int i=0;i<3;i++) {
			emp[i].display();
		}
		
		
		

	}

}
