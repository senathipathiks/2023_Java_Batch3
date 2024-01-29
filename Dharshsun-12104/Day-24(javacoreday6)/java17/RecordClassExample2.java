package com.javacoreday6;

record Alien(int id,String name) {
	
//	Alien(int id,String name){
//		
//		if(id==0)
//			throw new IllegalArgumentException("id connot be zero");
//		this.id=id;
//		this.name=name;
//		
//	}
	
}

public class RecordClassExample2 {

	public static void main(String[] args) {
		
		Alien obj1 = new Alien(123, "Sanjay Khanna");
		System.out.println("Using toString : "+obj1.toString());
		
		Alien obj2 = new Alien(123, "Sanjay Khanna");
		System.out.println("Using HashCode Function : "+obj2.hashCode());
		
		System.out.println("Using Equals Fuction : "+obj1.equals(obj2));
		
//		Alien obj3 = new Alien(0, null);
	}

}