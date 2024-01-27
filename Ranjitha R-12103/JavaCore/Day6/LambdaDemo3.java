package Day6;

import java.util.HashMap;

public class LambdaDemo3 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 78);
		map.put(2, 90);
		map.put(2, 34);

//		map.forEach((n)->System.out.println(n+""));

//		Scanner sc = new Scanner(System.in);
	//	int mapSize = 0;
		// System.out.println("Enter the list of the array");
		// mapSize = sc.nextInt();
		// System.out.println("Enter the list element");
		//for (int i = 0; i < mapSize; i++) {
//			int key = sc.nextInt();
//			int elem = sc.nextInt();
//			map.put(key, elem);
		//}
		System.out.println("Iterating using For each :");

		map.keySet().forEach((i) -> System.out.println(i + " : " + map.get(i)));

	}

}
