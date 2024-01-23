package Day_3;

public class StringEg {

	public static void main(String[] args) {
		String s1=new String ("Java Developer");
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s1.codePointAt(3));
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.equals("Java developer"));
		System.out.println(s1.equalsIgnoreCase("Java developer"));
		System.out.println(s1.compareTo("Java Developer"));
		System.out.println(s1.compareToIgnoreCase("Java Developer"));
		System.out.println(s1.concat(" Srinivasan"));
		System.out.println(s1.endsWith("per"));
		System.out.println(s1.substring(5,11));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		char[]c=s1.toCharArray();
		String s[]=s1.split(" ");
		for (String ch : s) {
			System.out.println(ch);
		}
		String r1=s1.replace(' ', ';');
		System.out.println(r1);
		System.out.println(s1);
		
		
		
		
		

	}

}
