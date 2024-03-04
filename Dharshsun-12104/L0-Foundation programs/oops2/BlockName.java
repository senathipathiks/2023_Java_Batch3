package com.oops2;
//reference compile memory form stack
//static block for ensuring some prelogic and hardware specification.
//instance will execute while creating objects.

public class BlockName {
	BlockName(){
		System.out.println("Constructor");
	}
	BlockName(int a){
		System.out.println("constructor 2");
	}
	
	{
		System.out.println("Instance blocks");
	}
	
	static {
		System.out.println("static blocks");//will execute before main method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("main method");
			
			BlockName obj1 = new BlockName();
			BlockName obj2 = new BlockName();
			BlockName obj3 = new BlockName();
	}

}
