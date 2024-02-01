package com.coreDay4;

public class ThisEx {

	
	int rollno;
	String name;
	ThisEx(int id, String name){
		rollno = id;
		this.name = name;
	}
	
	ThisEx(int no){
		rollno = no;
	}
	
	ThisEx(int rollno, String name){
		this(rollno);
		this.name = name;
		
	}
	
	ThisEx(ThisEx e){
		rollno = e.rollno;
		name = e.name;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno +", name=" + name + "]";
	}
	
	
	public static void main(String[] args) {
		 
		ThisEx t = new ThisEx(12121);
		System.out.println(t.toString());
		ThisEx t1 = new ThisEx(12121, "Surya");
		ThisEx t2 = new ThisEx(t1);
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
	}

}
