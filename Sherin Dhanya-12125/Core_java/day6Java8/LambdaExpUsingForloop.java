package com.day6Java8;
import java.util.ArrayList;
import java.util.Scanner;
public class LambdaExpUsingForloop {

	public static void main(String[] args) {
ArrayList<Integer> list=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
int listSize;
System.out.println("Enter the list size");
listSize=sc.nextInt();
System.out.println("Enter the list elements");
for(int i=0;i<listSize;i++) {
	list.add(sc.nextInt());
}
//using for each
System.out.println("Iterationg Using for each:");
for(int i:list)
	System.out.println(i+"");
//using lambda expression
System.out.println("Iterationg Using for lambda expression:");
list.forEach((n)->System.out.println(n+""));
sc.close();
	}

}
