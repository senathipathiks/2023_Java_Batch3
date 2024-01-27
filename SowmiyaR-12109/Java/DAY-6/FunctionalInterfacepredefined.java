package Day6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfacepredefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> names=Arrays.asList("Sowmi","Sherin","Deepi","Varsh","Kavs");
      
      //declare the predicate type as string and use
      //lamda expression to create object
      Predicate<String> p=(s)->s.startsWith("S");
      
      //Iterate through the list
      for(String st : names) {
    	  //call the test method
    	  if(p.test(st)) {
    		  System.out.println(st);
    	  }
      }
	}

}
