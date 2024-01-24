package com.coreDay4;

public class ClassExample {

	int rollno;
	String name;
	
	ClassExample(int id, String name){
		rollno = id;
		this.name = name;
	}
	
	public static void increment() {
		
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno +", name=" + name + "]";
	}
	
	
	public static void main(String args[]) {
		// Class Example
		
		ClassExample c = new ClassExample(12107, "Jeeva");
		System.out.println(c.toString());
		System.out.println(new ClassExample(124, "Prasanth").toString());
	}

}
