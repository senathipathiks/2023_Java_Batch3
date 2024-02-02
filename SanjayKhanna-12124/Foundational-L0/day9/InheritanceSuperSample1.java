package com.day9;

class I{																					//Super class
	
	int a=10;
	
}

class J extends I{																			//Sub class
	
	int a=20;
	
	void display() {
		System.out.println("Super class Variable A : "+super.a);							//Using super keyword
		System.out.println("Sub Class Variable A : "+a);														
	}
	
}

public class InheritanceSuperSample1 {

	public static void main(String[] args) {
		
		J obj = new J();																	//Object creation
		obj.display();
		
	}

}
