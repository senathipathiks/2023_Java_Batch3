package Day6;

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class LambdaExample2 {
//
//	public static void main(String[] args) {
//	 ArrayList<Integer> list = new ArrayList<Integer>();
//	 Scanner sc =new Scanner(System.in);
//	  
//	 int listSize;
//	 System.out.println("Enter the list Size");
//	 listSize=sc.nextInt();
//	 System.out.println("Enter the Elements");
//	 for(int i=0;i<listSize;i++) {
//		 list.add(sc.nextInt());
//	 }
//	 System.out.println("Iterating Using for Each:");
//	 /* using for Each
//
//	 for (int i :list){
//	 System.out.printn(i)	 
//
//	}*/
//	 // Using Lambda Expression for ArrayList iteration
//     list.forEach(i -> System.out.println(i));
//	 
//	}
//	
//
//}
 

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LambdaExample2 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int mapSize;
        System.out.println("Enter the Map Size");
        mapSize = sc.nextInt();
        sc.nextLine(); // consume the newline character

        System.out.println("Enter the Key-Value Pairs");
        for (int i = 0; i < mapSize; i++) {
            System.out.print("Enter Key: ");
            String key = sc.nextLine();
            System.out.print("Enter Value: ");
            int value = sc.nextInt();
            sc.nextLine(); // consume the newline character
            map.put(key, value);
        }

        System.out.println("Iterating Using Lambda:");

        // Using Lambda Expression for HashMap iteration
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
