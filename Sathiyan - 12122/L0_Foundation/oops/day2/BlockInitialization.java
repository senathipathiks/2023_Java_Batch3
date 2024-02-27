package com.oops.day2;

public class BlockInitialization {
	
	int a,b,c;
	
	
	{
		a= 50;
		m1();
	}
	
	BlockInitialization(){
		b=20;
	}
	
	BlockInitialization(int c){
		this.c=c;
	}
	
	void m1() {
		System.out.println("Sathya");
	}
	
	
	public static void main(String[] args) {
		
		BlockInitialization obj=new BlockInitialization();//Initialized a,b and c loads with default value 
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		
		BlockInitialization obj2=new BlockInitialization(5);//Initialized a,c and b loads with default value.
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.c);
		
		
		//a is common bcz it initialized in anonymous block.
		//whenever we creating a object anonymous bloack is automatically executed.
		
	}

}
