package com.oops.day2;

public class Blocks2 {
	
	Blocks2(){
		System.out.println("No argument Constructor");
	}
	
	Blocks2(int a){
		System.out.println("Argument Constructor");
		
	}
	
	{
		System.out.println("I'm a Non-static block");
	}

	static {
		System.out.println("I'm a Static block");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("Main methods");
		
		
		Blocks2 block=new Blocks2();
		Blocks2 block2=new Blocks2(5);
		

	}

}
