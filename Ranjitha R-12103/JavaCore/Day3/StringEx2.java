package Day3;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Java,Programming,world");
		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.equals("Java programming"));
		System.out.println(s1.equalsIgnoreCase("Java programming"));
		System.out.println(s1.compareTo("Java programming"));
		System.out.println(s1.compareToIgnoreCase("java programming"));
		System.out.println(s1.concat(" World"));
		System.out.println(s1.endsWith("ing"));
		System.out.println(s1.substring(5,7));
		System.out.println(s1.trim());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		char[] c=s1.toCharArray();
		String s[]=s1.split(",");
		for(String  ch:s) {
			System.out.println(ch);
		}
	
//		array is immutable it value cannot be changed
//		s1.replace(',', ';');
//		System.out.println(s1);

		//when it take it  as reference it will be changed
		s1=s1.replace(',', ';');
		System.out.println(s1);

	}

}
