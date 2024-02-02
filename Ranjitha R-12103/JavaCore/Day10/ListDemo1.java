package Day10;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.addAll(arr);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		arr.remove(0);
		System.out.println(arr);
		System.out.println(arr.get(3));
		arr.removeAll(arr);
		System.out.println(arr);
		arr.clear();
		System.out.println(arr);
	
	}

}
