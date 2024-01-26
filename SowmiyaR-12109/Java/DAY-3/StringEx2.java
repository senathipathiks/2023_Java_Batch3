package Day3;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1=new String("Java,programming,world");
//     System.out.println(s1.charAt(2));
//     System.out.println(s1.length());
//     System.out.println(s1.indexOf('J'));
//     System.out.println(s1.indexOf('p'));
//     System.out.println(s1.lastIndexOf('a'));
     System.out.println(s1.equals("java programming"));     
	 System.out.println(s1.equalsIgnoreCase("java programming"));
	System.out.println(s1.compareTo("Java programming"));
	System.out.println(s1.compareToIgnoreCase("java programmin"));
	System.out.println(s1.concat("world"));
	System.out.println(s1.endsWith("ing"));
	System.out.println(s1.substring(5,7));
	System.out.println(s1.trim());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	char[] c=s1.toCharArray();
	String s[]=s1.split(",");
	for(String ch:s)
	{
		System.out.println(ch);
	}
	
	s1=s1.replace(',', ';');
	System.out.println(s1);
	}

}
