package rel.edu.java8Features;

interface Pen {

//	default void color() {
//
//	}

	public void write();

//	static void reWrite() {
//
//	}
}

public class MethodDriver {

	public void write() {
		System.out.println("Im draw method");

	}
	
	
	public static void main(String[] args) {
		
		//MethodDriver m = new MethodDriver();
		
//		Pen p = new MethodDriver()::write;
//		p.write();
//		System.out.println(p);
	}
}
