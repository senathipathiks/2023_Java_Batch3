package Day_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Lambda2 {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of list ");
		int listsize=sc.nextInt();
		System.out.println("Enter the elements ");
		for (int i = 0; i < listsize; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("Iterating..using for each");
		
		for (Integer i : list) {
			System.out.println(i+" ");
		}
		
		System.out.println("Iterating..using lambda for each");
		
		list.forEach((n)->System.out.print(n+" "));
		sc.close();
	}

}
