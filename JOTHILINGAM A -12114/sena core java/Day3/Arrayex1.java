package Day3;

import java.util.Iterator;

public class Arrayex1 {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		String name[]= {"jothi","abi","hema","kiru"};
		
		System.out.println(arr.length);
		
		//normal for looop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// for each
		for (int i:arr) {
			System.out.println(i);
		}
		
		// print string values array for each loop
		
		for (String s : name) {
			System.out.println(s);
		}

	}

}
