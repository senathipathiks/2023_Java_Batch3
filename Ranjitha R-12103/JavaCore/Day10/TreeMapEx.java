package Day10;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(1, null);
		map.put(2, "Arun");
		map.put(3, "yogesh");
		map.put(4, "Dhinesh");
		map.put(1, "Lokesh");
		
		System.out.println(map);
		System.out.println(map.get(2));
		
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
