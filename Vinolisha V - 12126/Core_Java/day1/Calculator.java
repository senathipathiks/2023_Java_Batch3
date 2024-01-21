package com.day1;
import java.util.Scanner;

 class CalculatorMath{
	
		public double add(double num1,double num2) {
			return num1+num2;	

		}
		public double sub(double num1,double num2) {
			return num1-num2;
		}
		
		public double multiple(double num1,double num2) {
			return num1*num2;
		}
		
		public double divide(int num1,int num2) {
			return num1/num2;
		}
		
		public double modulo(int num1,int num2) {
			return num1%num2;
		}
		
}

public class Calculator{
	
		public static void main(String[] args) {
			boolean b=true;
			
			Scanner sc=new Scanner(System.in);
			
			CalculatorMath cal=new CalculatorMath();
			
			do {
				
				System.out.println("1.addition\n2.subtraction\n3.division\n4.modulus\n5.multiply\n6.exit");
				
				switch(sc.nextInt()) {
				case 1:{
					System.out.println("Enter the value1 and value2");
					int num1=sc.nextInt();
					int num2=sc.nextInt();
					System.out.println(cal.add(num1, num2));
					break;
				}
				case 2:{
					System.out.println("Enter the value1 and value2");
					int num1=sc.nextInt();
					int num2=sc.nextInt();
					System.out.println(cal.sub(num1, num2));
					break;
					}
				case 3:{
					System.out.println("Enter the value1 and value2");
					int num1=sc.nextInt();
					int num2=sc.nextInt();
					System.out.println(cal.divide(num1,num2));										
					break;
				}
				case 4:{
					System.out.println("Enter the value1 and value2");
					int num1=sc.nextInt();
					int num2=sc.nextInt();
					System.out.println(cal.modulo(num1, num2));
					break;
					}
				case 5:{
					System.out.println("Enter the valu1 and value2");
					int num1=sc.nextInt();
					int num2=sc.nextInt();
					System.out.println(cal.multiple(num1, num2));
					break;
					}
				case 6:{
					b=false;
					System.out.print("Thank You");
					break;
				}
				default:
					System.out.println("Enter a Valid input");
					break;
				
				}
				
		}while(b);
	
		
			
		}
}
