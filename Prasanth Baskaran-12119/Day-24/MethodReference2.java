package com.Day6;


interface Sayable{
	
	void say();
}

public class MethodReference2 {
	
	  public static void saysomething() {
		  
		  System.out.println("Hello static method");
	  }
	  
	  public void Something() {
		  
		  System.out.println("Hello , this is non-static method");
	  }

	public static void main(String[] args) {
		
		MethodReference2 m = new MethodReference2();
		
		Sayable s = m::Something;
		
		s.say();
		
		
	}

}
