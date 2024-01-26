package Day_3;

public class StringBuilderEg1 {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Java");
		System.out.println(s1.append(" Developer"));
		System.out.println(s1.reverse());
		// here in string buffer content and size can modified but 
		//in string it cannot be done
		
		System.out.println(s1.reverse());
		System.out.println(s1.length());
		System.out.println(s1.insert(0, "I'm a "));
		System.out.println(s1.replace(0, 3,"Srinivas was"));
	}

	}


