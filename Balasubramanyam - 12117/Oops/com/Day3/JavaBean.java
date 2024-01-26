package com.Day3;

public class JavaBean {
    public char gender;
    public int age;
    
	public JavaBean(char gender, int age) {
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

	public static void main(String[] args) {
		JavaBean baby1 = new JavaBean('M',0);
		System.out.println("Gender: "+baby1.getGender());
		System.out.println("Age: "+baby1.getAge());
		baby1.setAge(1);
		System.out.println("Gender: "+baby1.getGender());
		System.out.println("Age: "+baby1.getAge());
		
		
	}

}
