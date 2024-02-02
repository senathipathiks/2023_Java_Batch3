package com.day2;
import java.util.ArrayList;
import java.util.Iterator;
import  java.util.Scanner;

public class ArrayListApplication {
		private static Scanner sc= new Scanner(System.in);
		private static ArrayList<Integer> list=new ArrayList<Integer>();
		
	public static void main(String[] args) {
		int opt;																																								//6. Quit
		boolean decision=true;
		System.out.println("Application Started...");
		do{
			System.out.println("1-Add Element \n2-Remove Element \n3-Search Element \n4-Update Element \n5-View All Element \n6-Exit \nEnter your Option : ");
			opt=sc.nextInt();
			switch (opt) {
			case 1:addElement();break;
			case 2:removeElement();break;
			case 3:searchElement();break;
			case 4:updateElement();break;
			case 5:viewElement();break;
			case 6:{decision=false;
				System.out.println("Application Stopped..!!");			
			};break;
			default:System.out.println("Invalid option");
			}
			
		}while(decision);

	}
	
	private static void viewElement() {
		System.out.println("List : "+list); 
		
	}
	
	private static void updateElement() {
		System.out.println("Enter the Position and element : ");
		int pos = sc.nextInt();
		int elem=sc.nextInt();
		list.set(pos, elem);
		viewElement();				
	}
	
	private static void searchElement() {
		System.out.println("Enter the Element for Search");
		int elem=sc.nextInt();
		
		Iterator<Integer> it = list.iterator();								//Using Iterator Concept
		int i=0;
		while(it.hasNext()) {
			if(it.next()==elem) {
				System.out.println("Element found at "+i+" position");
				break;
			}
			i++;
		}
		if(i==list.size()) {
			System.out.println("Element not Found..!");
		}
		
	}
	
	private static void removeElement() {
		System.out.println("Enter the Element to remove");
		int elem=sc.nextInt();
		Iterator<Integer> it = list.iterator();								//Using Iterator Concept
		int i=0;
		boolean flag = false;
		while(it.hasNext()) {
			if(it.next()==elem) {
				list.remove(i);
				flag= true;
				System.out.println("Element Removed ");
				break;
			}
			i++;
		}
		if(flag==false) {
			System.out.println("Element not Found..!");
		}
		else {
			viewElement();
		}
	}
	
	private static void addElement() {
		System.out.println("Enter the elements");
		int elem=sc.nextInt();
		list.add(elem);
		viewElement();
		}

}
