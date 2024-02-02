package Day10;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);

		// for loop
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}

		System.out.println();

		// for each
		for (Integer i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();

		// Iterator
		Iterator<Integer> itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
