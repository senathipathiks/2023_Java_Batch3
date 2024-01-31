package com.java8;

record Hospital(String name, int id) {
	public Hospital(String name, int id) {
		if(id==0)
			throw new IllegalArgumentException("id cannot be zero");
		
		this.name = name;
		this.id = id;
		
	}
}

public class AutoRecClass {

	public static void main(String[] args) {
		Hospital a = new Hospital("Aravind", 0);
		Hospital a1 = new Hospital("Aravind Eye", 101);
		
		System.out.println(a);
	}

}
