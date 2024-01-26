package com.day4;

public class ConcatWithMethodOverLoading {
	
    void concat(int a,int b) {
    	System.out.println(a+" "+b);
    }
    void concat(String a,String b) {
    	System.out.println(a+b);}
    void concat(float a,float b) {
        System.out.println(a+" "+b);}
	
	public static void main(String[] args) {
		ConcatWithMethodOverLoading b = new ConcatWithMethodOverLoading();
		b.concat("hello", "world");
		b.concat(10, 20);
		b.concat(2.7f, 3.0f);
		
	}}