package Day10;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ram");
		map.put(2, "Thamizh");
		map.put(3, "Ranjitha");
		map.put(4, "Ranjani");
		map.put(null, null);
		map.put(4, "Arun");
		System.out.println(map);
		System.out.println(map.get(1));

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}
	}

}
