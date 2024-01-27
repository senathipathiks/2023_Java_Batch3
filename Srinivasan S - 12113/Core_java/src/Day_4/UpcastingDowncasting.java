package Day_4;

import Day_2.InstanceEg;

class A1{
	void display() {
		System.out.println("A class");
	}
}

class B1 extends A1{
	void display() {
		System.out.println("B class");
	}
}

class C1 extends B1{
	void display() {
		System.out.println("C class");
	}
}

public class UpcastingDowncasting {

	public static void main(String[] args) {
		
		A1 a=new A1();
		A1 b=new B1();
		B1 c=new C1();
		 
		if(new A1() instanceof B1) 
			
			System.out.println("hii");
			
			
		a.display();
		b.display();
		c.display();
//		d.display();

	}

}
