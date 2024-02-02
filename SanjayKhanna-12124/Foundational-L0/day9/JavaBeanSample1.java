package com.day9;

class Person{
	private String gender;
	private int age;
	public Person(String gender) {
		System.out.println("New born.... : "+gender);
	}
	
	public Person(String gender, int age) {
		this(gender);
		this.gender = gender;
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		 
}
public class JavaBeanSample1 {
	
	public static void main(String[] args) {
		
		Person sanjay = new Person("Male",0);
		System.out.println("Gender : "+sanjay.getGender());
		System.out.println("Age : "+sanjay.getAge());
		sanjay.setAge(22);
		System.out.println("After Using Setter to set current age");
		System.out.println("Gender : "+sanjay.getGender());
		System.out.println("Age : "+sanjay.getAge());
		
		Person sam = new Person("Female",0);
		System.out.println("Gender : "+sam.getGender());
		System.out.println("Age : "+sam.getAge());
		sam.setAge(21);
		System.out.println("After Using Setter to set current age");
		System.out.println("Gender : "+sam.getGender());
		System.out.println("Age : "+sam.getAge());
		
	}
}
