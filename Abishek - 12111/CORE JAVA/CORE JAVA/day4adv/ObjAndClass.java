package com.day4adv;
class Student 
{
	int rollno;
	String name;
	Student()
	{
		
	}
	Student(int no,String n)
	{
		rollno=no;
		name =n;
	}
	Student(Student e)
	{
		rollno=e.rollno;
		name =e.name;
	}
	public String toString()
	{
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
}
public class ObjAndClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student(123, "Abishek"); //parameterized constructor
		System.out.println(obj.toString());
		
		System.out.println(new Student(124, "Emperor").toString());//default
		
		Student obj1 = new Student(obj); //copy constructor
		
		
		System.out.println(obj1.toString());
	}

}
