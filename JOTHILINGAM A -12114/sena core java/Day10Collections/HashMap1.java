package Day10Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "jo");
		map.put(2, "jo");
		map.put(3, "jo");
		map.put(4, "jo");
		map.put(5, "jo");
		map.put(6, "jo");
		map.put(7, "jo");
		map.put(null, null);
		map.put(4, "Jothi");
		System.out.println(map.get(1));
		
		for(Map.Entry<Integer,String> m:map.entrySet()) {
			System.out.println(m.getKey()+ " : "+m.getValue());
		}
		
	}

}
