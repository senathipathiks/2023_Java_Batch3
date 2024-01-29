package com.Day6;

interface Square{
	
	int calc(int x) ;
	
	//obj clss mehtods
	
	String toString();
}
	
public class FuncInterface {

	public static void main(String[] args) {
		
		int size = 15;
		
		Square s = (x)->x*x;
		
		System.out.println(s.calc(size));
		
		
	}


}
