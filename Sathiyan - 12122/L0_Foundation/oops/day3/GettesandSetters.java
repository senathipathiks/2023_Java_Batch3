package com.oops.day3;
//Java Bean

class Person{
	private int age;
	private char gender;
	
	Person(int age, char gender) {
		this.age = age;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
}

public class GettesandSetters {

	public static void main(String[] args) {
		
		Person ref=new Person(22,'M');
		System.out.println("Age is : "+ref.getAge());
		System.out.println("Gender is : "+ref.getGender());
		
		ref.setAge(23);
		System.out.println("After one year age becomes : "+ref.getAge());
		

	}

}
