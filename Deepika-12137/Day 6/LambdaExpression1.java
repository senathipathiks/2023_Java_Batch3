package com.day6;
import java.util.*;
import java.util.Scanner;
public class LambdaExpression1 {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	int lsize;
	System.out.println("Enter the size of an array");
	lsize=sc.nextInt();
	System.out.println("Enter the elements");
	for (int i = 0; i <lsize; i++) {
	list.add(sc.nextInt());	
	}
	
	System.out.println("Iterating using for Each : ");
	
	list.forEach((n)->System.out.println(n+" "));
	sc.close();
	}
}
