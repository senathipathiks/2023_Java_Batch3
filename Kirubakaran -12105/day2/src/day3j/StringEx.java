package day3j;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
//		String s2="java";
		String s2=new String("java");
		System.out.println(s1==s2);
		String s3=new String("java programming");
		System.out.println(s3.charAt(2));
		System.out.println(s3.length());
		System.out.println(s3.indexOf('a'));
		System.out.println(s3.lastIndexOf('a'));
		System.out.println(s3.equals(s2));
		System.out.println(s3.equalsIgnoreCase("JAVA PROGRAMMING"));
		System.out.println(s3.compareTo("java program"));
		System.out.println(s3.compareToIgnoreCase("JAVA PROGRAMMI"));
		System.out.println(s3.concat(s2));
		System.out.println(s3.endsWith("g"));
		System.out.println(s3.endsWith("ing"));
		System.out.println(s3.endsWith("ava"));
		System.out.println(s3.substring(2,12));
		System.out.println(s3.trim());
		System.out.println(s3.toUpperCase());
		char [] c=s1.toCharArray();
		for (char d : c) {
			System.out.println(d);	
		}
		
		
		
	}

}
