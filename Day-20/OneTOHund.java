package com.Day2;

public class OneTOHund {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1 to Hind 3 & 5, 3,5 both
		
		System.out.println("Three Divided No's :");
		
		for (int i = 1; i <=100; i++) {
			
			
			if(i%3==0) {
				System.out.println(i);
			}
			
		}
		System.out.println("Five Divided No's :");
		
           for (int i = 1; i <=100; i++) {
			
			
			if(i%5==0) {
				System.out.println(i);
			}
			
		}
           System.out.println(" Three & Five Divided No's :");
           
           for (int i = 1; i <=100; i++) {
   			
   			
   			if(i%5==0 && i%3==0) {
   				System.out.println(i);
   			}
   			
   		}
           

		

	}

}
