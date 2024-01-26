package Day_2;

public class StringFn {

	public static void main(String[] args) {

		String s1 = "Heram";
//		String s2 = "Hero";
		String s2 = new String("  Heram  Hiii  ");
		
		System.out.println(s1==s2);
		
		System.out.println(s1.charAt(0));
		System.out.println(s2.length());
		System.out.println(s1.indexOf('r'));
		System.out.println(s2.lastIndexOf('m'));
		System.out.println(s1.equals("Heram"));
		System.out.println(s1.compareTo("Hera")); // return 0 if true and return 1 if false
		System.out.println(s1.concat(s2));// to concade the char
		System.out.println(s2.endsWith("Hiii")); // return as boolean if it matches
		System.out.println(s1.substring(2));// to invoke the specified char in a string
		System.out.println(s2.substring(2,8)); // to invoke the specified char in a string
		System.out.println(s2.trim()); // to remove the front and back spaces
	}

}
