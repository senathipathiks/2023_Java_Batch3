package com.day6Java8;
import java.util.HashMap;
import java.util.Scanner;
public class LambdaExpUsingHashMap {

	public static void main(String[] args) {
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	Scanner sc = new Scanner(System.in);
	int listsize;
	System.out.println("Enter the list size");
	listsize=sc.nextInt();
	System.out.println("Enter the list of elements");
	for(int i=0;i<listsize;i++) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		map.put(a, b);
		System.out.println(map);
	}
	//iterating using for each
	System.out.println("Iterating using for each:");
	map.keySet().forEach((i)->System.out.println(i+" : "+map.get(i)));
	sc.close();
	}

}
