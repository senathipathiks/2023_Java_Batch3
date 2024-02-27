package Day3.ClassExamples;

public class StringEx5 {

	public static void main(String[] args) {
		//String s1="Java";
				String s1=new String("Java");
				//String s2="Java"; //Getting true
				String s2=new String("Java");//getting false
				
				System.out.println("The two value compare result is:/n"+s1==s2);
				
				String str= new String("Java Programming");
				System.out.println(str.charAt(2));
				System.out.println(str.length());
				System.out.println(str.indexOf('a'));
				System.out.println(str.lastIndexOf('a'));
				System.out.println(str.equals("java programming"));
				System.out.println(str.equalsIgnoreCase("java programming"));
				System.out.println(str.compareTo("Java Programming"));
				System.out.println(str.compareToIgnoreCase("Java Programmingg"));
				System.out.println(str.concat(" Welcomes"));
				System.out.println(str.endsWith("ing"));
				System.out.println(str.substring(5,7));
				System.out.println(str.trim());
				System.out.println(str.toLowerCase());
				System.out.println(str.toUpperCase());
				char[] c=str.toCharArray();
				for (char i : c) {
					System.out.println(i);
					
				}
	}

}
