package rel.com.day10.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "sundhar");
		hm.put(2, "Srinivasan");
		hm.put(3, "Kirubakaran");
		hm.put(4, "Jothi");
		
		System.out.println(hm);
		
		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
	}

}
