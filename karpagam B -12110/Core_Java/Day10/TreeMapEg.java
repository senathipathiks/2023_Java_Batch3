package Com.Day10;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapEg {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map= new TreeMap<Integer, String>();
		
		map.put(1,"ball");// Insert
		map.put(3,"cat");
		map.put(2,"dog");
		map.put(4,"doll");
        System.out.println(map); // return in ascending order by default
        
		//reverse order
        
		TreeMap<Integer,String> map1 = new TreeMap<Integer, String>(Collections.reverseOrder());
		map1.put(1,"ball"); 
		map1.put(3,"cat");
		map1.put(2,"dog");
		map1.put(4,"doll");
        System.out.println("reverse:" +map1);

	}

}
