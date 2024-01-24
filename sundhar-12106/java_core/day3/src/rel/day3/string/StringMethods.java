package rel.day3.string;

public class StringMethods {
	
	public static void main(String[] args){
		
		String s1 = new String("Java programming");
		System.out.println(s1.charAt(3));
		System.out.println(s1.length());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.replace('a', 's'));
		System.out.println(s1.equals("Java programming"));
		System.out.println(s1.equalsIgnoreCase("Jsva programming"));
		System.out.println(s1.compareTo("Java programming"));
		System.out.println(s1.compareToIgnoreCase("JAVA programming"));
		System.out.println(s1.endsWith("ing"));
		System.out.println(s1.substring(4));
		System.out.println(s1.trim());
		s1.intern();
		
		StringBuffer s2 = new StringBuffer("sundhar");
		String s = new String();
		System.out.println( );
		
//		s2.append("raj");
		
	System.out.println(s2.capacity());
	
	
		
	}

}
