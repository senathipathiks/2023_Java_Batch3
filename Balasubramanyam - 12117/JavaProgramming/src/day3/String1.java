package com.day3;

public class String1 {

	public static void main(String[] args) {
		char[] c = {'j','a','v','a'};
		String name = new String(c);
		String s1="java";
		String s2="java";
		String s3 = new String(s2);
		System.out.println(s2==s3);
		System.out.println(s1==s2);
		System.out.println(name+"\n");
		String s =new String(" Java,Programming ");
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.length());
		System.out.println(s.equals("Java Programming"));
		System.out.println(s.equalsIgnoreCase("java programming"));
		System.out.println(s.compareTo("Java Programmin"));
		System.out.println(s.compareToIgnoreCase("java programmin"));
		System.out.println(s.concat(" World"));
		System.out.println(s.endsWith("g"));
		System.out.println(s.startsWith("J"));
		System.out.println(s.substring(4));
		System.out.println(s.substring(5,7));
		System.out.println(s.trim());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		char[] ch=s.toCharArray();
		String  split[] = s.split(",");
		for(String i:split) {
		System.out.print(i);}
		System.out.println();
		String v = "123";
		Integer d = Integer.valueOf(v);
		System.out.println(d);
		System.out.println(s.replace("a", "c+"));
		s=s.replace('a', 'b');
		System.out.println(s);
		
		
		
		
		
        
	}

}
