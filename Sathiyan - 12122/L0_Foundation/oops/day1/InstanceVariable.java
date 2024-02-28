package com.oops.day1;

public class InstanceVariable {
	int a=638328;//doesn't reflect to second object when making changes on 1st object

	public static void main(String[] args) {

		InstanceVariable var=new InstanceVariable();
		InstanceVariable var2=new InstanceVariable();
		
		System.out.println(var.a);
		System.out.println(var2.a);
		
		var.a=860805;
		
		System.out.println(var.a);
		System.out.println(var2.a);
		

	}

}
