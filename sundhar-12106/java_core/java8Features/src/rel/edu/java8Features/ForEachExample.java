package rel.edu.java8Features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;

public class ForEachExample {
	
	public static void main(String[] args) {
		
		 List<String> gamesList = new ArrayList<String>();  
	        gamesList.add("Football");  
	        gamesList.add("Cricket");  
	        gamesList.add("Chess");  
	        gamesList.add("Hocky");
	        
	        
	        //Internal loop java8

//	        gamesList.forEach((String var) ->System.out.println(var));
//	        gamesList.forEach((String i) ->{System.out.println(i);});
	        
//	        gamesList.forEach(System.out::println);
	        
	        
	        HashMap<Integer, String> hm = new HashMap<Integer, String>();
	        
	        hm.put(18, "Virat");
	        hm.put(19, "Dube");
	        hm.put(17, "Deepak");
	        hm.put(16, "Sarfraz");
	        hm.put(12, "Yuvi");
	        
	        
//	       hm.keySet().forEach((i) -> System.out.println(i));+
	 

	}

}
