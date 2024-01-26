package Day_2;

public class StringBufferEx1 {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Java");
		System.out.println(s.append(" Program"));
		System.out.println(s.replace(0, 4, "Python"));
		System.out.println(s.reverse());
		System.out.println(s.reverse());
		System.out.println(s.insert(0, "Java"));
		System.out.println(s.capacity());
		System.out.println(s.charAt(8));
		System.out.println(s.hashCode());
		

	}

}
