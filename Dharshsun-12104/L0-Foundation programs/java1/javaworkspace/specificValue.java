package com.java1;

public class specificValue {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int tofind = 3;
		boolean found = false;
		
		for(int n : num) {
			if(n == tofind) {
				found = true;
				break;
			}
		}
		if(found)
			System.out.println(tofind+"is found");
		else
			System.out.println(tofind+"is found");
			
			
		
	}

}
