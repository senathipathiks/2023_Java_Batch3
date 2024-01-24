package com.coreDay4;

public class ConstructorEx {


	int rollno;
	String name;
	ConstructorEx(int id, String name){
		rollno = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno +", name=" + name + "]";
	}
	
	
	public static void main(String[] args) {
		// Constructor and It's Type
		ConstructorEx c = new ConstructorEx(12341, "Surya");
		System.out.println(c.toString());
		ConstructorEx c1 = (c);
		System.out.println(c1.toString());
	}

}
