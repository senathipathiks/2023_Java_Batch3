package com.code;

import java.util.Iterator;

public class CheckMe {

	
	int number1=0;
	int number2=1;
	public void printFibo(int limit) {
		//  1 1 2 3 5 8 
				
		LogicLoop(limit);
		
		LogicLoop(limit);
		
		LogicLoop(limit);		
		
		
	}

	private void LogicLoop(int limit) {
		while(number2<limit) {
			System.out.println(number2);
		number2=number2+number1;
		number1=number2-number1;
		}
	}
	
	public static void main(String[] args) {
		
		CheckMe check=new CheckMe();
		
		check.printFibo(5);
		
	}
}
