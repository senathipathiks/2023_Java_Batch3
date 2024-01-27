package Day6;

import java.util.ArrayList;
import java.util.Scanner;

public class LamdaExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		Scanner sc = new Scanner (System.in);
//		int a=sc.nextInt();
		int listsize;
		System.out.println("Enter the list size:");
		listsize =sc.nextInt();
		System.out.println("Enter the list elements:");
		for(int i=0;i<listsize;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Iterating using for each: ");
		//using for each
		for(int i:list) {
			System.out.println(i);
		}
		
		//lamda expression
//		list.forEach((n)-> System.out.println(n+" "));
//		sc.close();
		
		

	}

}
