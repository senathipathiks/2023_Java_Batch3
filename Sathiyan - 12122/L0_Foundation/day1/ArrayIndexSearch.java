package com.day1;

import java.util.*;

class Arrays{
	double m1() {
		
		double a=10;
		return a;
	}
}

public class ArrayIndexSearch {

	public static void main(String[] args) {

				int array[]= {1,2,3,4,5,6,7};
				int flag=0;
				System.out.print("Enter the Element You want to search : ");
				Scanner sc=new Scanner(System.in);
				int input=sc.nextInt();
				for (int i = 0; i < array.length; i++) {
					if (array[i]==input) {
						System.out.println("Value present in the index : " +i);	
						flag++;
						break;
					}
				}
				if (flag==0) {
					System.out.println("Value is not present in a Array");
				}
				sc.close();


				
	}

}
