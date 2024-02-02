package com.day8;

public class InstanceBlockSample1 {
	int a,b,c;
	
	{
		System.out.println("New Object is Created .. .!");
		a=10;
	}
	
	public InstanceBlockSample1() {
		b=20;
	}
	
	public InstanceBlockSample1(int c) {
		this.c=c;
	}
	
	void display() {
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("C : "+c);
	}

	public static void main(String[] args) {
		InstanceBlockSample1 obj1 = new InstanceBlockSample1();
		obj1.display();
		InstanceBlockSample1 obj2 = new InstanceBlockSample1(30);
		obj2.display();
	}

}
