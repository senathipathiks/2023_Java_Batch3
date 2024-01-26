package Java_Day_3;

public class CharAt {

	public static void main(String[] args) {
		
		String s1=new String("Java Programming");
		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.equals("java programming"));
		System.out.println(s1.equalsIgnoreCase("java programming"));
		System.out.println(s1.compareTo("java programming"));
		System.out.println(s1.compareToIgnoreCase("java programming"));
		System.out.println(s1.concat("World"));
		System.out.println(s1.endsWith("g"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(5,7));
		System.err.println(s1.trim());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());

	}

}
