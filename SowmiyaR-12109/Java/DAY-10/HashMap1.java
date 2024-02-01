package Day10;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Srini");
		map.put(2, "duregesh");
		map.put(3, "nandhini");
		map.put(4, "Rajesh");
		map.put(null, null);
		map.put(4, "Gowtham");
		System.out.println(map);
		System.out.println(map.get(4));
		
		for(Map.Entry<Integer, String>m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
