package com.day4;

public class MethodOverLoadding2 {
    void add(int a, int b)
    {System.out.println(a+b); }
    void add(int a, int b,int c)
    {System.out.println(a+b+c); }
    void add(float a,float b) {
    	System.out.println(a+b);}
   public static void main(String[] args) {
	   MethodOverLoadding2 b = new MethodOverLoadding2();
	   b.add(10, 20);
	   b.add(10, 40, 60);
	   b.add(2.0f, 4.0f);
		

	}}


