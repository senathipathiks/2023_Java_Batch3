package Day6;

import java.util.HashMap;
import java.util.Scanner;

public class LambdaEx3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
		
		System.out.println("Enter the list size");
		int size =sc.nextInt();
		
		System.out.println("Enter the elements ");
		
		for(int i=0;i<size;i++) {
			int key=sc.nextInt();
			String value=sc.next();
			h1.put(key, value);
		}
		System.out.println("Iterating For each:");
		// for each Lambda exprerssion
		
		h1.keySet().forEach((i) -> System.out.println(i+ " :"+h1.get(i)));
		
		sc.close();
		

	}

}
