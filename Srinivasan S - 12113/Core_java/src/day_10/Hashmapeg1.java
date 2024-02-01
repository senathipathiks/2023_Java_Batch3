package day_10;

import java.util.HashMap;
import java.util.Map;

public class Hashmapeg1 {

	public static void main(String[] args) {
		HashMap<Integer,String>map1=new HashMap<Integer,String>();
		map1.put(1, "Srinivasan");
		map1.put(2, "Sundar");
		map1.put(3, "Prashanth");
		map1.put(4, null);
		map1.put(4, "Gowtham");
		
//		System.out.println(map1);
		
		for(Map.Entry<Integer, String>m:map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
