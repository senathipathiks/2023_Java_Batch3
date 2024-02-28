package com.oops.day5;

interface One1{
	int a=10;//Variable 1 (Public,static type Variable by default)
}

interface Two2{
	int a=20;//Variable 2(Public,static type Variable by default)
}

interface Three extends One1,Two2{
	void sum();
}

class Sum implements Three{
	
	public void sum() {
		System.out.println(One1.a+Two2.a); //With the help of Class name we can call the Variable. 
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Sum s=new Sum();
		s.sum();
		
	}

}
