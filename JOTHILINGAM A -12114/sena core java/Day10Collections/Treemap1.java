package Day10Collections;

import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(); 
        map.put(10, "Elden rings");
        map.put(30, "Valorant");
        map.put(60, "League of legends");
        map.put(20, "Diablo");
        System.out.println(map);
        map.put(40, "For honor");
        System.out.println(map);
        //map.remove(10);
        System.out.println(map);
        System.out.println(map.get(20));
        map.putIfAbsent(90, "Integer");
        System.out.println(map);
        System.out.println(map.remove(10));
	}

}
