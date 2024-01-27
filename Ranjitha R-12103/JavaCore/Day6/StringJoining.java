package Day6;

import java.util.StringJoiner;

public class StringJoining {

	public static void main(String[] args) {

		StringJoiner s = new StringJoiner(",");
		s.add("Ranjitha");
		s.add("Rajaraman");
		s.add("Ram");
		s.add("Kumar");

		//s.setEmptyValue("node");
		System.out.println(s);

		StringJoiner s1 = new StringJoiner(";", "\\", "/");
		s1.add("Arun");
		s1.add("Ranjitha");
		s1.add("Rajaraman");
		s1.add("Ram");
		s1.add("Kumar");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.merge(s));

	}

}
