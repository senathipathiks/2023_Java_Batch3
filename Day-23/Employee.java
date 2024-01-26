package com.Day5;
// Array of object
import java.util.Scanner;

class Emp{
	
	int eNo;
	String Name;
	
	Emp(){
		
	}
	
	void getdata(int no,String name) {
		eNo=no;
		Name=name;
	}
	
	void display() {
		System.out.println("No:"+eNo);
		System.out.println("Name: "+ Name);
	}
}

public class Employee {

	public static void main(String[] args) {
		//System.out.println("Hello");
		
       Emp[] emp= new Emp[10];
       
       Scanner sc = new Scanner(System.in);
       for (int i = 0; i < 3; i++) {
    	   
    	   emp[i]=new Emp();
    	   System.out.println("Enter the Value");
    	   int n = sc.nextInt();
    	   
    	   System.out.println("Enter the Name");
    	   
    	   sc.nextLine();
    	   
    	   String fn =sc.nextLine();
    	   emp[i].getdata(n, fn);
    	   
		
	}
       
       for (int i = 0; i < 3; i++) {
		
    	   emp[i].display();
	}
	}

}
