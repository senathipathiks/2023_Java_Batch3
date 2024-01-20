package com.day1;

public class Variables {
     int a=10; //instant variable or object variable
     static int b=20; //Static or class variable
	public static void main(String[] args) {
		int c=30; //Local variable
		Variables v=new Variables();
		System.out.println(v.a);
        System.out.println(Variables.b);
        System.out.println(c);
	}

}
