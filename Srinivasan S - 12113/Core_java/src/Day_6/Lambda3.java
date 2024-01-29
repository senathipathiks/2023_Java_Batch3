package Day_6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;


public class Lambda3 {

	public static void main(String[] args) {
		HashMap<Integer, String>map1=new HashMap<Integer, String>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size");
		int size=sc.nextInt();
		System.out.println("Enter map elements");
		
		for (int i = 0; i < size; i++) {
			int key=sc.nextInt();
			String val=sc.next();
			map1.put(key, val);
		}
		
		System.out.println("Iterating through for each");
		
		for (Integer s : map1.keySet()) {
			System.out.println(s);
		}
		
		System.out.println("Iterating through lambda");
		
		
//		 Collection<String> arr = map1.values();
//		
//	System.out.println(arr);
//	
		map1.keySet().forEach((i)->
			System.out.println(map1.get(i)));
		sc.close();
		

	}

}
