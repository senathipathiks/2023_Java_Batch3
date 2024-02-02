package day5collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "apple");
		map.put(3, "orange");
		map.put(5, "mango");
		map.put(2, "banana");
		map.put(4, "grapes");
		
		map.put(5, "masagi");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+": "+m.getValue());
			
		}
	}

}
