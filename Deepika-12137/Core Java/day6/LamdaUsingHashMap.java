package com.day6;
import java.util.HashMap;
import java.util.Scanner;
public class LamdaUsingHashMap {
public static void main(String[] args) {
	HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
	Scanner sc = new Scanner(System.in);
	int name;
	System.out.println("Enter the size of an array");
	name=sc.nextInt();
	System.out.println("Enter the elements");
	for (int i = 0; i <name; i++) {
	int key=sc.nextInt();
	int elem=sc.nextInt();
	map.put(key, elem);
	}
	
	System.out.println("Iterating using for Each : ");
	
	map.keySet().forEach((i)->System.out.println(i +" "+map.get(i)));
	sc.close();
	
	
}
}
