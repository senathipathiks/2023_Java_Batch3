package core.day3;

public class Append {

	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("java");
		System.out.println(s1.append("programming"));
//		System.out.println(s1.reverse());
//		System.out.println(s1.length());
		System.out.println(s1.replace(0, 4, "c,c++"));
		System.out.println(s1.insert(5, "is a"));
		
		
}
}
