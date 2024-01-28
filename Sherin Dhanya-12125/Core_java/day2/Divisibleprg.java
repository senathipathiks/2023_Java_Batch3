package com.day2;
//Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both
public class Divisibleprg {

	public static void main(String[] args) {
		System.out.println("The numbers divisible by 3:");
	for(int i=1;i<=100;i++) {
		if(i%3==0) {
			System.out.print(i+" ");
		}
	}
			System.out.println("\n The numbers divisible by 5:");
			for(int i=1;i<=100;i++) {
				if(i%5==0) {
					System.out.print(i+" ");
				}}
					System.out.println("\n The numbers divisible by 3 and 5:");
					for(int i=1;i<=100;i++) {
						if(i%3==0 && i%5==0) {
							System.out.print(i+" ");
		}
	}

	}

}
