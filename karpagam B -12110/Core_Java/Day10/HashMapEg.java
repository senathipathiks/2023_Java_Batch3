package Com.Day10;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEg {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Kaviya");
		map.put(2, "Kamini");
		map.put(3, "Revathi");
		map.put(4, "Gayathri");
		System.out.println(map.get(1));
		
		System.out.println("-------------------");

		for(Entry<Integer, String> m:map.entrySet())
        {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
	}

}