package Com.Day3;

public class StringEg1 {

	public static void main(String[] args) {
		
		 String s1=new String ("Java Programmer");
	        System.out.println(s1.length());
	        System.out.println(s1.charAt(5));
	        System.out.println(s1.codePointAt(3));
	        System.out.println(s1.indexOf('a'));
	        System.out.println(s1.lastIndexOf('e'));
	        System.out.println(s1.equals("Java developer"));
	        System.out.println(s1.equalsIgnoreCase("Java developer"));
	        System.out.println(s1.compareTo("Java Developer"));
	        System.out.println(s1.compareToIgnoreCase("Java Developer"));
	        System.out.println(s1.concat(" Kaviya"));
	        System.out.println(s1.endsWith("mer"));
	        System.out.println(s1.substring(5,11));
	        System.out.println(s1.toLowerCase());
	        System.out.println(s1.toUpperCase());
	        char[]c=s1.toCharArray();
	        System.out.println(c);
	        System.out.println(s1.replace('a', 'z'));
	        System.out.println(s1);// becoz string is immutable
	         
			 String s2=new String ("Hello,world");
             String s[]=s2.split(",");
             for(String ch:s) {
            	 System.out.println(ch);
             }
             System.out.println(s2.replace(',', ':'));
             System.out.println(s2);
	        
	}

}
