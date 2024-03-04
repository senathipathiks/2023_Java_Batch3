package com.oops3;

// java bean is a collection of private variables getter and setter.

class Person{
     private char gender;
     private int age;
	public Person(char gender, int age) {
		
		this.gender = gender;
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	}
public class Bean {
	public static void main(String[] args) {
		Person obj = new Person('M', 0);
		System.out.println("The baby Gender is "+obj.getGender());
		System.out.println("The baby Age is "+obj.getAge());
		obj.setAge(1);
		System.out.println("The baby Age is "+obj.getAge());
		
		
	}

}
