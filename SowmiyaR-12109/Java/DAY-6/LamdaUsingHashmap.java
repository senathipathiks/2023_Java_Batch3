package Day6;

//import java.util.iterate;
import java.util.HashMap;
import java.util.Scanner;

public class LamdaUsingHashmap {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		Scanner sc = new Scanner (System.in);
//		int a=sc.nextInt();
		int listsize;
		System.out.println("Enter the list size:");
		listsize =sc.nextInt();
		System.out.println("Enter the list elements:");
		for(int i=0;i<listsize;i++) {
			 int key=sc.nextInt();
			 int elem=sc.nextInt();
			 map.put(key, elem);
}
		System.out.println("Iterating using for each: ");
		
//		for(int i:map) {
//			System.out.println(i);
//		}
		
		//lambda expression
		map.keySet().forEach((i)->System.out.println(i+": "+map.get(i)));
		sc.close();

	}

}
