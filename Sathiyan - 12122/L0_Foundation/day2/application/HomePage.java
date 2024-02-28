package com.day2.application;
import java.util.*;
public class HomePage {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean decision=true;
		ArrayList<Integer> list=new ArrayList<>();
		
		do {
			System.err.println("WELCOME TO ARRAYLIST");
			System.out.println("1.Add Element \n2.Search Element \n3.Remove Element \n4.Update Element \n5.View all Element \n6.Quit");
			System.out.print("Enter Your Choice : ");
			int choice=sc.nextInt();
						
			switch (choice) {
			case 1:{
				System.out.println("Enter the total number of element: ");
				int n=sc.nextInt();
				System.out.println("Enter " +n+ " Elements");
				for (int i = 1; i <= n; i++) {
					list.add(sc.nextInt());
				}
				System.out.println("Element Added Successfully");
				break;
			}
			case 2:{
				int flag=0;
				System.out.print("Enter the element you want to search : ");
				int input=sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (input==list.get(i)) {
						flag++;
						System.out.println("Element found at : "+i);
						break;
					}
				}
				if (flag==0) {
					System.out.println("Element Not Found");
				}
				break;
			}
			case 3:{
				int flag=0;
				System.out.print("Enter the element you want to Remove : ");
				int input=sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (input==list.get(i)) {
						flag++;
						list.remove(i);
						System.out.println("Element Removed");
						break;
					}
				}
				if (flag==0) {
					System.out.println("Element Not Found");
				}
				break;
			}
			case 4:{
				System.out.println("Enter the position you want to update: ");
				int pos=sc.nextInt();
				System.out.println("Enter the Value to update: ");
				int val=sc.nextInt();
				list.set(pos, val);
				System.out.println("Value Updated");
				break;
			}
			case 5:{
					System.err.println(list);
				break;
			}
			case 6:{
				System.out.print("Are you sure you want to Exit [Y | N] : ");
				char yorn=sc.next().charAt(0);
				if (yorn=='Y' || yorn == 'y') {
					System.err.println("*********Welcome*********");
					decision=false;
					break;
				}
				break;				
			}			
			default:{
				System.out.println("Invalid Input");

			}
			}
		} while (decision);
		sc.close();
	}
}
