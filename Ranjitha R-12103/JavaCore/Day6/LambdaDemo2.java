package Day6;

import java.util.ArrayList;
import java.util.Scanner;

public class LambdaDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int listSize;
		System.out.println("Enter the list of the array");
		listSize = sc.nextInt();
		System.out.println("Enter the list element");
		for (int i = 0; i < listSize; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Iterating using For each :");
		// for each
//		for (int i : list)
//			System.out.println(i + "");

		// lamda expression
		
		list.forEach((n) -> System.out.println(n + ""));
		sc.close();

	}

}
