package com.Day6;
import java.util.*;
public class LambdaForEach {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length: ");
        int listSize = sc.nextInt();
        System.out.println("Enter the Elements: ");
        for(int i=0;i<listSize;i++) {
        	list.add(sc.nextInt());
        }
        System.out.println("Iterating using forEach: ");
        for(int i:list) {
        	System.out.print(i+" ");
        }
        list.forEach((n)->{System.out.print(n);});
	}
	

}
