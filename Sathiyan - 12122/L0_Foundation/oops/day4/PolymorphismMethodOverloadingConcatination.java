package com.oops.day4;

public class PolymorphismMethodOverloadingConcatination {

	void concat(int a,int b) {//Concatinate the integer value...
		System.out.println("Concatinated integer value is : "+a+b);
	}
	
	void concat(float a,float b) {//Concatinate the floaat value...
		System.out.println("Concatinated Float value is : "+a+b);
	}
	
	void concat(String a,String b) {//concatinate theString value...
		System.out.println("After concatinated the string is : "+a+b);	
	}
	
	//main method
	public static void main(String[] args) {
		PolymorphismMethodOverloadingConcatination ref=new PolymorphismMethodOverloadingConcatination();
		ref.concat(10.5f, 25.0f);
		ref.concat(4, 59);
		ref.concat("Sathya", "Siva");
		

	}

}
