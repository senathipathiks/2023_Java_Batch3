package Day6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LambdaEx2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of the arraylist");
		
		int size=sc.nextInt();
		
		System.out.println("Enter the elements :");
		
		for (int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("Iterating Using for each");
		//using for each
		for (int i:list) {
			System.out.print(i+"");
			
		}
		
		//lambda Expresion
		
		list.forEach((n)-> System.out.print(n+ " "));
		
		

	}

}
