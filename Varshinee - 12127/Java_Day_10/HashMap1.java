package Java_Day_10;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Varsh");
		map.put(2, "Sandy");
		map.put(3, "Subi");
		map.put(4, "Appu");
		map.put(5, null);
		map.put(5, "Raga");
		System.out.println(map);
		System.out.println(map.get(1));
		
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
