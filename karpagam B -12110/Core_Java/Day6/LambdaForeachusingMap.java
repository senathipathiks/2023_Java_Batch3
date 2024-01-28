package Com.Day6;

import java.util.HashMap;

public class LambdaForeachusingMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(1, "Kaviya");
		map.put(2, "Raj");
		map.put(3,"yuva"); 
		
		System.out.println(map);
		System.out.println(map.get(1));//get value through object call
		
		map.keySet().forEach((i)->System.out.println(i+ " :"+map.get(i)));
		}

}
