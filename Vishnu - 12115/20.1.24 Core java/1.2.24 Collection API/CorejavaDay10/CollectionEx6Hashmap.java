package CorejavaDay10;

import java.util.HashMap;
import java.util.Map;

public class CollectionEx6Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Sena");
		map.put(2, "Valan");
		map.put(3, "Logesh");
		map.put(4, "Rajesh");
		map.put(null,null);
		map.put(4, "Gowthm");
		System.out.println(map.get(1));
		
		
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
