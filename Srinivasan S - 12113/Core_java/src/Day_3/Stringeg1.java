package Day_3;

public class Stringeg1 {

	public static void main(String[] args) {
//	String s1="Java",s2="Java";//string literal
		/*
		 * When ever string literal is created it will search in string pool 
		 * When we created string object it will search in heap area
		 */
		
	String s1= new String("Java"),s2=new String("Java");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1==s2);
	

	}

}
