package Day3;

public class StirngEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1=new String("Java is a");
////		String s2="java";
//		String s2=new String("java"); // it stores heap memory because it shows false
//		System.out.println(s1==s2);
//
//		String s="  java programming   ";
//		System.out.println(s.charAt(3));
//		System.out.println(s.length());
//		System.out.println(s.indexOf('o'));
//		System.out.println(s.lastIndexOf('a'));
//		System.out.println(s.equals("Java programming"));
//		System.out.println(s.equalsIgnoreCase("Java programming"));
//		System.out.println(s.compareTo("Java programming")); // it shows integer value
//		System.out.println(s.compareToIgnoreCase("java programing"));
//		
//		System.out.println(s.concat(" language"));   //to add Stirng
//		
//		System.out.println(s.endsWith("mming"));  // to find ends with value
//		
//		System.out.println(s.substring(5)); // split the string to give index
//		System.out.println(s.substring(5, 7)); // shows the caracter given index ranje
//		
//		System.out.println(s.trim());  //to remove the spaces fornt and back
//		System.out.println(s.toLowerCase());
//		System.out.println(s.toUpperCase());
//		
//		System.out.println(s.toCharArray());
//		
//		
//		char[] c=s.toCharArray();
//		for(char ch:c) {
//			System.out.print(ch);
//		}
//	}
		System.out.println(s1.intern());
	}
}
