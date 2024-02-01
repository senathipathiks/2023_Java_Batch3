package com.coreDay2;

public class Labeledbreak {

	public static void main(String[] args) {
		aa:
		 for(int i = 0; i<10; i++) {
			System.out.println(i);
			break aa;
		}
		
		System.out.println("Out of Loop");
		
		
		
	}

}
