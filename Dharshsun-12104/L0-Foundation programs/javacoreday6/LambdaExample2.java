package com.javacoreday6;
import java.util.ArrayList;
import java.util.Scanner;

public class LambdaExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
			int listSize;
			System.out.println("Enter the List Size");
			listSize=sc.nextInt();
			System.out.println("Enter the List Elements ");
			for(int i=0;i<listSize;i++) {
				list.add(sc.nextInt());
			}
			
			System.out.println("Iterating Using For Each : ");
			//using for each
//			for(int i:list)											
//				System.out.print(i+" ");
			
			//lambda expression
			list.forEach((n)->System.out.print(n+" "));
			sc.close();
	}

}
