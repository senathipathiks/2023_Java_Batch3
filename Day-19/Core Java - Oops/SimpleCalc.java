package com.newclass;

import java.util.Scanner;

public class SimpleCalc {
	
	private static int val1;
	private static int val2;
	
	
	
	
	
	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the First value :");
		
		val1= sc.nextInt();
		
		System.out.println("Enter the Second value :");
		
		val2= sc.nextInt();
		 
		System.out.println("Select the operation \n1.Add \n2.Subrate \n3.Mul \n4.Div");
		
	    int option = sc.nextInt();
	    
	    switch (option) {
		case 1:{
			
			int Add = val1 +val2;
			
			System.out.println(" The Addition Value is :"+Add);
		}
		break;
		
		case 2:{
			
			int sub = val1-val2;
			
			System.out.println("The Subrate value is :"+sub);
		}
		break;
			
		case 3:{
			int mul = val1*val2;
			
			System.out.println("The Multiplication value is :"+mul);
		}
		break;
		
		case 4:{
			if(val1 ==0) {
				System.out.println("please enter the right value !!!");
			}
			
			else {
				int div = (val1 / val2);
				
				System.out.println(" THe divition value is :"+div);
			}
			
			
		}
			
			
			break;

		default:
			break;
		}

		
		
		
		
		

	}

}
