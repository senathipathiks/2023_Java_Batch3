package com.day4adv;
class StudentEx
{
	int rollno;
	String name;
	StudentEx(int no)
	{
		rollno =no;
	}
	StudentEx (int rollno, String name)
	{
		//this.rollno = rollno;
		this(rollno); //constructor which is accepting one arg
		this.name = name;
	}
	StudentEx(StudentEx e)
	{
		rollno=e.rollno;
		name=e.name;
	}
	void classDisplay()
	{
		System.out.println("Student Class");
	}
	@Override
	public String toString() {
		
		this.classDisplay();
		return "StudentEx [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEx obj = new StudentEx(123, "Abishek"); //parameterized constructor
		System.out.println(obj.toString());
		
		System.out.println(new StudentEx(124, "Emperor").toString());//default
		
		StudentEx obj1 = new StudentEx(obj); //copy constructor
		
		
		System.out.println(obj1.toString());
	}

}
