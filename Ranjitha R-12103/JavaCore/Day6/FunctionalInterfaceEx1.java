package Day6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceEx1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ranjitha", "Ram", "Arun", "Thamizh", "Ranjani");
		
		Predicate<String> p = (obj) -> obj.startsWith("R");
		for (String st : names) {
			if (p.test(st))
				System.out.println(st);
		}

	}

}
