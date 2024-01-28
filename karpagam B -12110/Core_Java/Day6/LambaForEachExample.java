package Com.Day6;

import java.util.ArrayList;

import java.util.Scanner;

public class LambaForEachExample {

	public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<Integer>();
       Scanner sc=new Scanner(System.in);
       int listSize;
       System.out.println("Enter the size of the list:");
       listSize=sc.nextInt();
       System.out.println("Enter the list elements:");
       for (int i = 0; i < listSize; i++) {
		list.add(sc.nextInt());
	}
       
       System.out.println("Iterating using for each loop:");
       // for each
       for (Integer i : list) {
		System.out.println(i+" ");
	}
       System.out.println("------------------");
       System.out.println("Using lambda expression");
       //lambda expression
       list.forEach((n)->System.out.println(n+" "));
       sc.close();
       
	}

}
