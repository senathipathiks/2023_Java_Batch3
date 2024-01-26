package com.Day4;

public class OverloadingEx {
	
	public static void display(int a) {
		
		System.out.println("It display's "+a+" time");
		
		System.out.println("area of circle is :"+(3.14*a*a));
		
		System.out.println("_____________________________________");
	}
	
   public static void display(int a,String b) {
	   
	   System.out.println("It is the Circles "+b);
	   
	   System.out.println(2*3.14*a);
	   
	   System.out.println("_______________________________________");
		
	}
   
   public static void display(String b, int a) {
	   
	   System.out.println("This is Circles "+b);
	   
	   System.out.println("area of circle is :"+(3.14*a*a));
	   
	   System.out.println(2*3.14*a);
		
	}

	public static void main(String[] args) {
		
		display(5);
		display(5,"Perimeter");
		display("Area & Perimeter",5);
		
		
		
	}

}
