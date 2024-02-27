package com.oops;


class HomeScreen {
	final int age=45;
	
	public int age() {
		System.out.println(age);
		return(age);
		
	}
	
	public static void main(String[] args) {
		HomeScreen s1=new HomeScreen();
		s1.age();
		
	}
}
