package com.day2;
//class Person {
//	int id ;
//	String name;
//	Person(int id,String name){
//	this.id=id;
//	this.name=name;
//	}
//}
//class Emp extends Person{
//	float salary;
//	Emp(int id,String name,float salary){
//		super(id,name);
//		this.salary=salary;
//		}
//	void display() {
//		System.out.println(id+" "+name+" "+salary);
//	}
//}
//

//class Practice{
//	public static void main(String[] args) {
//		Emp e = new Emp(101,"Balu",260000);
//;
//		e.display();
//}}

//class A{
//	A(){
//		System.out.println("hiii");
//	}
//	{
//		System.out.println("hello");
//	}}
//class A{
//	A(){
//		System.out.println("hello");
//	}
//	{
//		System.out.println("ANIMAL");
//	}
//	
//}
//class B extends A {
//	B(){
//		
//		System.out.println("hiiii");
//	}
//	B(int n){
//		
//		System.out.println("hiii2");
//	}
//	
//}
//
//public class Practice{
//	
//	public static void main(String[] args) {
//	   B b = new B();
//	   B b1 = new B(5);
//	   
//	}}
class A {
	final void hello() {
		System.out.println("hello");
	}
}
class B extends A{}

public class Practice{
	
	public static void main(String[] args) {
	   B b = new B(); b.hello();}}
























