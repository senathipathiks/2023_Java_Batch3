package Com.Day3;

public class StringBufferEg {

	public static void main(String[] args) {
		StringBuffer s1 =new StringBuffer("Java");
		System.out.println(s1.append(" Programming"));
//		System.out.println(s1.reverse());
		System.out.println(s1.length());
		
		System.out.println(s1);// changes will be reflected here
		
		System.out.println(s1.insert(5, "is a "));//we can change the size
	    System.out.println(s1.replace(0, 4, "Python"));//we can replace the substring
	    
		
		

}
}
