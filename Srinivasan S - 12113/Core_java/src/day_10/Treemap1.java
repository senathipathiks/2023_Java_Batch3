package day_10;

import java.util.Map;
import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		TreeMap<Integer, String>tree=new TreeMap<Integer, String>();
		
		tree.put(1, "Sena");
		tree.put(2, "Valan");
		tree.put(3, "Lokesh");
		tree.put(4, "Gowtham");
		tree.put(5, null);
		
		System.out.println(tree);
		
		for(Map.Entry<Integer, String> i:tree.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}

	}

}
