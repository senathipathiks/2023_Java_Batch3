package com.oops.day1;

public class ClassVariable {

	static int a=638328;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassVariable var=new ClassVariable();
		ClassVariable var2=new ClassVariable();
		
		System.out.println(var.a);
		System.out.println(var2.a);
		
		var.a=860805;
		
		System.out.println(var.a);
		System.out.println(var2.a);

	}

}
