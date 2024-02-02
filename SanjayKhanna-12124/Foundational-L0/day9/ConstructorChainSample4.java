package com.day9;

class G{
	public G() {
		System.out.println("This is a Super Class Default Constructor ");
	}
																										//Super Class Constructor Overloading
	public G(int a) {
		this();																							//Usage of this()
		System.out.println("This is a Super Class Parameterized Constructor : "+a);
	}
}

class H extends G{
	public H() {
		super(20);																						//Usage of Super()
		System.out.println("This is a Sub Class Default Constructor ");
	}
																										//Sub Class Constructor Overloading
	public H(int a) {
		System.out.println("This is a Sub Class Parameterized Constructor : "+a);
	}
}
public class ConstructorChainSample4 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		H obj = new H();

	}

}
