package Day4.ClassExamples;


public class PolyOverloadingEx {
	public static void area() {
		System.out.println(3.14*7*7);
	}
	public static void area(int side) {
		System.out.println(side*side);
	}
	public static void area(int l,int b) {
		System.out.println(l*b);
	}


	public static void main(String[] args) {
		 PolyOverloadingEx obj= new PolyOverloadingEx();
		 obj.area();
		 obj.area(8);
		 obj.area(2,5);
	
	}

}
