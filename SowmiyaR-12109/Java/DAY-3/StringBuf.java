package Day3;

public class StringBuf {

	public static void main(String[] args) {
		
    StringBuffer s1=new StringBuffer("Java");
    System.out.println(s1.append(" programming"));
    //we don't have reverse method
    //System.out.println(s1.reverse());
   //System.out.println(s1.length());
    System.out.println(s1.insert(5, "is a "));
    System.out.println(s1.replace(0, 4, "c,c++"));
    
	}

}
