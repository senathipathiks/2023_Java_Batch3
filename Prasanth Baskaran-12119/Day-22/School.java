package com.Day4;


import java.util.*;

//Write a Java program to create a class called "School" with attributes for students, teachers, 
//and classes, and methods to add and remove students and teachers, and to create classes.

public class School {
	
	static String Student;
	static String  teachers;
	static String Classes;
	

	static Map<Integer, String> m = new HashMap<>();
	
	static Map<Integer, String> m2 = new HashMap<>();
	
	  static ArrayList <String>a = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	static boolean b = true;
	 
	
	

	public static void main(String[] args) {
		
		while(true) {
		System.out.println("Enter You Option : \n1.Add\n2.Remove\n3.Exit");
		
		int op = sc.nextInt();
		
	  switch (op) {
	case 1:{
		
		System.out.println("Enter the Student name ???");
		
		sc.nextLine(); // for buffer reader
		String s = sc.nextLine();
		
		System.out.println("Enter the Class name ???");
		
		int c = sc.nextInt();
		
		
		System.out.println("Enter the Teacher name ???");
		sc.nextLine();
		
		String t = sc.nextLine();
		
	String flag = m.put(c, s); // add map student
	
	//System.out.println(flag);
	
		
	String flag2=	m2.put(c, t); // add map teacher
	
	if(flag==null && flag2==null) {
	
	
		
		System.out.println(m);
		System.out.println(m2);
		
		System.out.println("Your value added Successfully");
	}
	
	else {
		
		System.out.println("Your value is not added");
		
	}
		
	}
		
		
		
	
		
		break;

		
	case 2:{
		
		
		System.out.println("Enter the Class name for delete both teacher and Student ??");
		int d = sc.nextInt();
		
		m.remove(d);
		m2.remove(d);
		
		System.out.println("Removed Successfully");
		
		break;
	}
	
	case 3:{
		System.exit(op);
		
		break;
	}
	 default:
		break;
	}
	  System.out.println("Do you want continue  ? \n1.Y\n2.N");
	  int e = sc.nextInt();
	  if(e==1) {
		  b=true;
	  }
	  else {
		  b=false;
	  }
	
		
		
	}
}
}


